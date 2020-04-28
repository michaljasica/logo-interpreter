import antlr.impl.parser.SimpleLogoParserImpl;
import command.OneArgCommand;
import javafx.stage.Stage;
import javafx.application.Application;

import java.util.List;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        List<OneArgCommand> parse = new SimpleLogoParserImpl()
                .parse("fd 100 \r\n");

        System.out.println("DONE");

    }
}
