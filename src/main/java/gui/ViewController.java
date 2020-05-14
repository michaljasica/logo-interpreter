package gui;

import antlr.impl.parser.SimpleLogoParserImpl;
import command.Command;
import gui.model.Turtle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ViewController {

    private static final String NEW_LINE = "\r\n";
    private static final String COMMAND_LINE_ELEMENT = ">> ";

    @FXML
    private Button enter;

    @FXML
    private Pane draw_panel;

    @FXML
    private ImageView zolw;

    @FXML
    private TextArea console;

    private SimpleLogoParserImpl simpleLogoParser;
    private Turtle turtleManager;
    private TurtleController turtleController;

    public void onCreate(SimpleLogoParserImpl simpleLogoParser) {
        this.simpleLogoParser = simpleLogoParser;
        this.turtleManager = new Turtle(true, 0);
        this.turtleController = new TurtleController(turtleManager, draw_panel, zolw);
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
                .map(x -> turtleController.draw(x))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        zolw.setLayoutX(turtleManager.getX() - 10);
        zolw.setLayoutY(turtleManager.getY() - 10);

        draw_panel.getChildren().addAll(collect);
    }

    private String getNewCommandLineText() {
        return console.getText() + NEW_LINE + COMMAND_LINE_ELEMENT;
    }

}
