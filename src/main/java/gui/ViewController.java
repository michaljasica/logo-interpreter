package gui;

import antlr.impl.visitor.MainLogoVisitor;
import command.Command;
import command.PrintCommand;
import command.Type;
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
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ViewController {

    private final static Logger LOGGER = Logger.getLogger(ViewController.class.getName());
    private static final String NEW_LINE = "\r\n";

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

    private MainLogoVisitor simpleLogoParser;
    private Turtle turtle;
    private TurtleService turtleService;
    private ConsoleService consoleService;

    public void onCreate(MainLogoVisitor simpleLogoParser) {
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
        List<String> consolePrintCommands = parse.stream()
                .filter(command -> {
                    LOGGER.info(command.getType().toString() + " " + ((PrintCommand)command).getText());
                    return Type.PRINT.equals(command.getType());
                })
                .map(command -> ((PrintCommand)command).getText())
                .collect(Collectors.toList());
        consoleService.doPrintCommands(consolePrintCommands);

        List<Line> collect = parse.stream()
                .filter(command -> !Type.PRINT.equals(command.getType()))
                .map(x -> turtleService.draw(x))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        turtleImage.setLayoutX(turtle.getX() - 10);
        turtleImage.setLayoutY(turtle.getY() - 10);

        draw_panel.getChildren().addAll(collect);
    }

}
