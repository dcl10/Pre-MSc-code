package OfficeManager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Daniel on 09/11/2016.
 */
public class ReportController implements Initializable, MenuBar {

    ReportOutput reportOutput = new ReportOutput();

    private String homeDir = System.getProperty("user.home");
    private String directory = homeDir + "/IdeaProjects/BrewerWebsite/DBManager/src/TestFinishedFiles/";

    @FXML
    private ListView reportListView;

    @FXML
    private TextArea reportArea;

    @Override
    public void logout() throws IOException {
        Stage s;
        Parent root;
        s = (Stage) reportArea.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("loginscreen.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @Override
    public void change(ActionEvent event) throws IOException {
        Stage s;
        Parent root;
        s = (Stage) reportArea.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("orders.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @Override
    public void close() {
        Platform.exit();
    }

    @Override
    public void refresh() throws IOException, ClassNotFoundException {
        reportOutput.prepareList(directory);
        reportOutput.makeList(reportListView);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            reportOutput.prepareList(directory);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            reportOutput.makeList(reportListView);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onClick() throws IOException, ClassNotFoundException {
        reportOutput.listSelection(reportListView);
        reportOutput.getReport(reportArea);
    }

    public void finish() throws IOException {
        ReportInput reportInput = new ReportInput();
        reportInput.saveReport(reportArea.getText());
        lock();
    }

    public void clear() {
        reportArea.clear();
    }

    public void amend() {
        reportArea.setEditable(true);
    }

    public void lock() {
        reportArea.setEditable(false);
    }
}
