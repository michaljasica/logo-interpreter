import antlr.generated.*;
import antlr.impl.LogoImpl;
import javafx.stage.Stage;
import javafx.application.Application;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(
                "repeat 2 [ fd 100 + 55 rt 144 ] \r\n");

        SimpleLogoLexer markupLexer = new SimpleLogoLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        SimpleLogoParser logoParser = new SimpleLogoParser(commonTokenStream);
        SimpleLogoParser.ProgContext prog = logoParser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LogoImpl(), prog);
    }
}
