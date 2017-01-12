package OfficeManager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.*;


/**
 * Controller for the orders.fxml view.
 * When the scene is set to orders.fxml, initialize() prepares the ListView.
 */
public class OrderController implements Initializable, MenuBar{

    OrderOutput orderOutput = new OrderOutput();

    private String homeDir = System.getProperty("user.home");
    private String directory = homeDir + "/IdeaProjects/BrewerWebsite/DBManager/src/TestFiles/";

    @FXML
    private TextField nameField, emailField, contactNumberField;

    @FXML
    private TextArea addressArea, orderArea;

    @FXML
    private ListView<String> listView;

    @FXML
    private MenuItem newItem, reportItem;


    public void finish() throws IOException {
        OrderInput orderInput = new OrderInput();
        orderInput.makeOrder(nameField.getText(), emailField.getText(), contactNumberField.getText(),
                addressArea.getText(), orderArea.getText());
        orderInput.saveOrder();
        lock();
    }

    public void clear() {
        nameField.clear();
        emailField.clear();
        contactNumberField.clear();
        addressArea.clear();
        orderArea.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            orderOutput.prepareList(directory);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            orderOutput.makeList(listView);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void onClick() throws IOException, ClassNotFoundException {
        orderOutput.listSelection(listView);
        orderOutput.getPeople(nameField, emailField, contactNumberField, addressArea, orderArea);
    }


    @Override
    public void logout() throws IOException {
        Stage s;
        Parent root;
        s = (Stage) nameField.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("loginscreen.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    @Override
    public void change(ActionEvent event) throws IOException {
        if (event.getSource() == newItem) {
            Stage s;
            Parent root;
            s = (Stage) nameField.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("neworder.fxml"));
            Scene scene = new Scene(root);
            s.setScene(scene);
            s.show();
        } else if (event.getSource().equals(reportItem)) {
            Stage s;
            Parent root;
            s = (Stage) nameField.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("reports.fxml"));
            Scene scene = new Scene(root);
            s.setScene(scene);
            s.show();
        }
    }

    @Override
    public void close() {
        Platform.exit();
    }

    @Override
    public void refresh() throws IOException, ClassNotFoundException {
        orderOutput.prepareList(directory);
        orderOutput.makeList(listView);
    }

    public void amend() {
        nameField.setEditable(true);
        emailField.setEditable(true);
        contactNumberField.setEditable(true);
        addressArea.setEditable(true);
        orderArea.setEditable(true);
    }

    public void lock() {
        nameField.setEditable(false);
        emailField.setEditable(false);
        contactNumberField.setEditable(false);
        addressArea.setEditable(false);
        orderArea.setEditable(false);
    }
}
