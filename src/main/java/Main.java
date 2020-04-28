import antlr.impl.parser.SimpleLogoParserImpl;
import command.Command;
import javafx.stage.Stage;
import javafx.application.Application;

import java.util.List;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        List<Command> parse = new SimpleLogoParserImpl()
                .parse("repeat 2 [rt 100 + 50]\r\n");

        System.out.println("DONE");

    }
}
