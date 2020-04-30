
import gui.ViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        Parent root = (Parent)loader.load();
        Scene scene = new Scene(root, 300, 275);
        ViewController controller = (ViewController)loader.getController();
        controller.onCreate();

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

}
