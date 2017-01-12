package OfficeManager;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the login screen.
 * Changes the scene to orders.fxml.
 */

public class Controller {

    @FXML
    private Button button;

    @FXML
    private Label accessLabel;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    public void check() throws IOException {
        Credentials creds = new Credentials();
        if(creds.check(userName, password)){
            login();
        } else {
            accessLabel.setVisible(true);
        }
    }

    public void login() throws IOException {
        Stage s;
        Parent root;
        s = (Stage) button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("orders.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
}
