package OfficeManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;

/**
 * Created by Daniel on 07/11/2016.
 */
public class OrderOutput {

    private String[] s;
    private String message;
    private ObservableList<String> filename;

    public void makeList(ListView list) throws IOException, ClassNotFoundException {
        ObservableList<String> stuff = FXCollections.observableArrayList(s);
        list.setItems(stuff);
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void prepareList(String directory) throws IOException, ClassNotFoundException {
        File file = new File(directory);
        s = file.list();
    }

    public void getPeople(TextField name, TextField email, TextField number, TextArea address, TextArea order)
            throws IOException, ClassNotFoundException {
        String homeDir = System.getProperty("user.home");
        File file = new File(homeDir + "/IdeaProjects/Brewer Website/DBManager/src/TestFiles/" + message);
        FileInputStream fIS = new FileInputStream(file);
        ObjectInputStream oIS = new ObjectInputStream(fIS);

        Order orders = (Order) oIS.readObject();
        name.setText(orders.getName());
        email.setText(orders.getEmail());
        number.setText(orders.getContactNumber());
        address.setText(orders.getAddress());
        order.setText(orders.getOrder());

        fIS.close();
        oIS.close();
    }

    public void listSelection(ListView<String> list) {
        filename = list.getSelectionModel().getSelectedItems();
        message = filename.get(0);
    }
}
