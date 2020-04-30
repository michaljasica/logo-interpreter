package gui;

import antlr.impl.parser.SimpleLogoParserImpl;
import command.Command;
import command.OneArgCommand;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ViewController {

    private static int TURTLE_START_X_POSITION = 450;
    private static int TURTLE_START_Y_POSITION = 250;
    private static final String NEW_LINE = "\r\n";
    private static final String COMMAND_LINE_ELEMENT = ">> ";

    @FXML
    private Button enter;

    @FXML
    private Pane draw_panel;

    @FXML
    private Rectangle blue;

    @FXML
    private TextArea console;

    private SimpleLogoParserImpl simpleLogoParser = new SimpleLogoParserImpl();
    private Turtle turtleManager;

    public void onCreate() {
        turtleManager = new Turtle(TURTLE_START_X_POSITION, TURTLE_START_Y_POSITION, true, 0);
        blue.setLayoutX(TURTLE_START_X_POSITION);
        blue.setLayoutY(TURTLE_START_Y_POSITION);
        console.setText(">> ");
    }

    public void submit() {
        String[] split = console.getText()
                .split(">> ");
        String text = split[split.length - 1];
        List<Command> parse = simpleLogoParser.parse(text + NEW_LINE);
        console.setText(getNewCommandLineText());
        draw(parse);
    }

    private void draw(List<Command> parse) {
        List<Line> collect = parse.stream()
                .map(x -> TurtleController.draw(turtleManager, (OneArgCommand) x))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        draw_panel.getChildren().add(collect.get(0));
    }

    private String getNewCommandLineText() {
        return console.getText() + NEW_LINE + COMMAND_LINE_ELEMENT;
    }

}
