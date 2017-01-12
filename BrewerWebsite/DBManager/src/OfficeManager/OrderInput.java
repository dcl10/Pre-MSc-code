package OfficeManager;

import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Daniel on 07/11/2016.
 */
public class OrderInput {

    ArrayList<Order> testList = new ArrayList<>();

    public void makeOrder(String name, String email, String number, String address, String order){
        testList.add(new Order(name, email, number, address, order));
    }

    public void saveOrder() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JSON Files", "*.json"));
        File file = fileChooser.showSaveDialog(null);
        FileOutputStream outputStream = new FileOutputStream(file, true);
        ObjectOutputStream stream = new ObjectOutputStream(outputStream);

        for(Order order : testList){
            stream.writeObject(order);
        }
        outputStream.close();
        stream.close();
    }
}
