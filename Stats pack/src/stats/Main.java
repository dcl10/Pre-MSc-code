package stats;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("statpack.fxml"));
        Parent root = loader.load();
        Controller controller = new Controller();
        controller.init(primaryStage);
        primaryStage.setTitle("Stats Pack");
        primaryStage.setScene(new Scene(root, 600, 410));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
