package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.init(primaryStage);
        primaryStage.setTitle("RNA Translate");
        primaryStage.setScene(new Scene(root, 850, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
