package gui;

import antlr.impl.visitor.SimpleLogoParserImpl;
import command.Command;
import gui.model.Turtle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    private ImageView turtleImage;

    @FXML
    private TextArea consoleView;

    @FXML
    private TextField console;

    private SimpleLogoParserImpl simpleLogoParser;
    private Turtle turtle;
    private TurtleService turtleService;
    private ConsoleService consoleService;

    public void onCreate(SimpleLogoParserImpl simpleLogoParser) {
        this.simpleLogoParser = simpleLogoParser;
        this.consoleService = new ConsoleService(consoleView, console);
        this.turtle = new Turtle(true, 0);
        this.turtleService = new TurtleService(turtle, draw_panel, turtleImage);
    }

    public void submit() {
        String commands = consoleService.resolveCommands();
        List<Command> parse = simpleLogoParser.parse(commands + NEW_LINE);
        draw(parse);
    }

    private void draw(List<Command> parse) {
        List<Line> collect = parse.stream()
                .map(x -> turtleService.draw(x))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        turtleImage.setLayoutX(turtle.getX() - 10);
        turtleImage.setLayoutY(turtle.getY() - 10);

        draw_panel.getChildren().addAll(collect);
    }

}
