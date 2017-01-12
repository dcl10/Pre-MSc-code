package OfficeManager;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Daniel on 15/11/2016.
 */
public class NewController implements MenuBar {

    @FXML
    private MenuItem orderItem, reportItem;

    @FXML
    private TextField nameField, emailField, contactNumberField;

    @FXML
    private TextArea addressArea, orderArea;

    public void finish() throws IOException {
        OrderInput orderInput = new OrderInput();
        orderInput.makeOrder(nameField.getText(), emailField.getText(), contactNumberField.getText(),
                addressArea.getText(), orderArea.getText());
        orderInput.saveOrder();
    }

    public void clear() {
        nameField.clear();
        emailField.clear();
        contactNumberField.clear();
        addressArea.clear();
        orderArea.clear();
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
        if(event.getSource() == orderItem) {
            Stage s;
            Parent root;
            s = (Stage) nameField.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("orders.fxml"));
            Scene scene = new Scene(root);
            s.setScene(scene);
            s.show();
        }else if (event.getSource().equals(reportItem)) {
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
        System.out.println("This method doesn't work in this view");
    }
}
