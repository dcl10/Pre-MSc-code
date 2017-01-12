package OfficeManager;

import javafx.stage.FileChooser;

import java.io.*;

/**
 * Created by Daniel on 12/11/2016.
 */
public class ReportInput {

    public void saveReport(String text) throws IOException{
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File file = fileChooser.showSaveDialog(null);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(text);
        fw.close();
        bw.close();
    }
}
