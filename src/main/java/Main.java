
import antlr.impl.visitor.MainLogoVisitor;
import antlr.impl.visitor.ExpressionListener;
import antlr.impl.visitor.PrintVisitor;
import antlr.impl.visitor.SimpleCommandsListener;
import command.Command;
import gui.ViewController;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.application.Application;

import java.util.List;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root, 300, 275);
        ViewController controller = (ViewController) loader.getController();

        ExpressionListener expressionListener = new ExpressionListener();
        PrintVisitor printVisitor = new PrintVisitor(expressionListener);
        SimpleCommandsListener simpleCommandsListener = new SimpleCommandsListener(expressionListener);
        MainLogoVisitor simpleLogoParser = new MainLogoVisitor(simpleCommandsListener, printVisitor);

        controller.onCreate(simpleLogoParser);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//
//        ExpressionListener expressionListener = new ExpressionListener();
//        PrintVisitor printVisitor = new PrintVisitor(expressionListener);
//        SimpleCommandsListener simpleCommandsListener = new SimpleCommandsListener(expressionListener);
//        MainLogoVisitor simpleLogoParser = new MainLogoVisitor(simpleCommandsListener, printVisitor);
//
//        List<Command> parse = simpleLogoParser
//                .parse("make \"done 100\r\n");
//
//        System.out.println("DONE");
//    }

}
