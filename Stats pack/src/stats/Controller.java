package stats;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    private Stage stage;

    @FXML
    private Label progressLabel, pValueLabel, dfLabel;
    @FXML
    private TextField inputField, outputField, chiObservedField, chiExpectedField, chiOutputField;
    @FXML
    private Tab standardDeviationTab, chiSquaredTab;


    public void init(Stage stage){
        this.stage = stage;
    }

    public void clearTab(){
        if (standardDeviationTab.isSelected()){
            standardDevClearFields();
        }else{
            if (chiSquaredTab.isSelected()){
                chiSquaredClearFields();
            }
        }
    }

    public void clearAll(){
        standardDevClearFields();
        chiSquaredClearFields();
    }

    public void closeApp(){
        Platform.exit();
    }

    public void saveFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(stage);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        if (inputField.getText().isEmpty() && outputField.getText().isEmpty()){
            //do nothing
        }else{
            bw.write("<Standard Deviation>" + "\n" + "Data: " + inputField.getText() + "\n" + "Standard Deviation: "
                    + outputField.getText() + "\n" + "\n");
        }

        if (chiObservedField.getText().isEmpty() && chiExpectedField.getText().isEmpty() &&
                chiOutputField.getText().isEmpty()){
            //do nothing
        }else{
            bw.write("<Chi-squared>" + "\n" + "Observed: " + chiObservedField.getText() + "\n" + "Expected: "
                    + chiExpectedField.getText() + "\n" + "Chi-squared: " + chiOutputField.getText()
                    + "\n" + "DF= " + dfLabel.getText() + "\n"
                    + "P-value= " + pValueLabel.getText() + "\n" + "\n");
        }
        bw.close();
    }

    public void standardDevClearFields(){
        inputField.clear();
        outputField.clear();
        progressLabel.setText("Ready");
    }

    public void chiSquaredClearFields(){
        chiObservedField.clear();
        chiExpectedField.clear();
        chiOutputField.clear();
        dfLabel.setVisible(false);
        pValueLabel.setVisible(false);
        progressLabel.setText("Ready");
    }

    public void standardDevCalculation(){
        String string = inputField.getText();
        String string1[] = string.split(", ");
        double number[] = new double[string1.length];

        for (int counter = 0; counter < string1.length; counter++){
            number[counter] = Double.parseDouble(string1[counter]);
        }

        StandardDev standard = new StandardDev(number);
        outputField.setText(String.valueOf(standard.aveSqDist));
        progressLabel.setText("Calculation complete");
    }

    public void chiSquaredCalculation(){
        String observed = chiObservedField.getText(), expected = chiExpectedField.getText();
        String ob[] = observed.split(", "), ex[] = expected.split(", ");
        double obn[] = new double[ob.length], exn[] = new double[ex.length];
        double eP95[]={3.84,5.99,7.82,9.49,11.07,12.59,14.07,15.51,16.92,18.31};
        double df = obn.length-1;

        for (int counter1 = 0; counter1 < ob.length; counter1++){
            obn[counter1] = Double.parseDouble(ob[counter1]);
        }

        for (int counter2 = 0; counter2 < ob.length; counter2++){
            exn[counter2] = Double.parseDouble(ex[counter2]);
        }

        ChiSquared chi = new ChiSquared(obn, exn);
        chiOutputField.setText(String.valueOf(chi.chiSq));

        dfLabel.setText(String.valueOf(df));
        dfLabel.setVisible(true);

        if (obn.length-1 > 10){
            pValueLabel.setText(String.valueOf(eP95[10]));
            pValueLabel.setVisible(true);
        }else{
            pValueLabel.setText(String.valueOf(eP95[(int) (df-1)]));
            pValueLabel.setVisible(true);
        }
        progressLabel.setText("Calculation complete");
    }
}
