package OfficeManager;

import javafx.event.ActionEvent;

import java.io.IOException;

/**
 * Created by Daniel on 08/11/2016.
 */
public interface MenuBar {

    void logout() throws IOException;
    void change(ActionEvent event) throws IOException;
    void close();
    void refresh() throws IOException, ClassNotFoundException;
}
