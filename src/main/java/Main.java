
import antlr.impl.visitor.SimpleLogoParserImpl;
import antlr.impl.visitor.ExpressionListener;
import antlr.impl.visitor.SimpleCommandsListener;
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

        ExpressionListener expressionListener = new ExpressionListener();
        SimpleCommandsListener simpleCommandsListener = new SimpleCommandsListener(expressionListener);
        SimpleLogoParserImpl simpleLogoParser = new SimpleLogoParserImpl(simpleCommandsListener);

        controller.onCreate(simpleLogoParser);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//
//        ExpressionListener expressionListener = new ExpressionListener();
//        SimpleCommandsListener simpleCommandsListener = new SimpleCommandsListener(expressionListener);
//        SimpleLogoParserImpl simpleLogoParser = new SimpleLogoParserImpl(simpleCommandsListener);
//
//        List<Command> parse = simpleLogoParser
//                .parse("repeat 2 [rt 100 + 50]\r\n");
//
//        System.out.println("DONE");
//    }

}
