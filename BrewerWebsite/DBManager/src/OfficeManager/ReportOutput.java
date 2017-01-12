package OfficeManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;

/**
 * Created by Daniel on 12/11/2016.
 */
public class ReportOutput {

    private String[] s;
    private String message;
    private String details = String.valueOf(LocalDateTime.now());
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


    public void getReport(TextArea reportSpace) throws IOException, ClassNotFoundException {
        String homeDir = System.getProperty("user.home");
        File file = new File(homeDir + "/IdeaProjects/BrewerWebsite/DBManager/src/TestFiles/" + message);
        FileInputStream fIS = new FileInputStream(file);
        ObjectInputStream oIS = new ObjectInputStream(fIS);

        Order orders = (Order) oIS.readObject();
        details = details + "\n" + orders.getOrder() +"\n";
        reportSpace.setText(details);

        fIS.close();
        oIS.close();
    }

    public void listSelection(ListView<String> list) {
        filename = list.getSelectionModel().getSelectedItems();
        message = filename.get(0);
    }
}
