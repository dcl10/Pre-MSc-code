package OfficeManager;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Created by Daniel on 08/11/2016.
 */
public class Credentials {

    private String[] users = {"Adam Kay", "Daniel Lea"};
    private String[] passwords = {"noblesage", "brewmaster"};

    public boolean check(TextField user, PasswordField password) {
        boolean b = false;
        int counter;
        for(counter = 0; counter < users.length; counter++) {
            if (user.getText().equals(users[counter]) && password.getText().equals(passwords[counter])) {
                b = true;
            }
        }
        return b;
    }
}
