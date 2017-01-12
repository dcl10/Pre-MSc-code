package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Controller {

    private Stage stage;

    @FXML
    private TextArea inputPane, outputPane;

    @FXML
    private Label completeLabel;



    public void init(Stage stage){
        this.stage = stage;
    }

    public void clearText(){
        inputPane.clear();
        outputPane.clear();
        completeLabel.setVisible(false);
    }

    public void translation(){
        String inSeq = inputPane.getText();

        Translation trans = new Translation();
        trans.translate(inSeq);
        outputPane.setText(trans.protSeq);
        completeLabel.setVisible(true);
    }

    public void saveFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(stage);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(outputPane.getText());
        bw.close();
    }

    public void closeApp(){
        Platform.exit();
        }

    }
