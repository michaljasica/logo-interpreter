package gui;

import antlr.impl.visitor.MainLogoVisitor;
import command.Command;
import command.PrintCommand;
import command.Type;
import gui.model.Turtle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ViewController {

    private final static Logger LOGGER = Logger.getLogger(ViewController.class.getName());
    private static final String ERROR_MESSAGE = "Nie obsługiwana komenda";
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

    @FXML
    private Label errorOutput;

    private MainLogoVisitor simpleLogoParser;
    private Turtle turtle;
    private TurtleService turtleService;
    private ConsoleService consoleService;

    public void onCreate(MainLogoVisitor simpleLogoParser) {
        this.simpleLogoParser = simpleLogoParser;
        this.consoleService = new ConsoleService(consoleView, console, errorOutput);
        this.turtle = new Turtle(true, 0);
        this.turtleService = new TurtleService(turtle, draw_panel, turtleImage);

        console.setOnKeyPressed(this::keyListener);
    }

    private void keyListener(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                keyUp();
                break;
            case DOWN:
                keyDown();
                break;
            case ENTER:
                submit();
                break;
        }
    }

    public void submit() {
        try {
            consoleService.errorClearOutput();
            String commands = consoleService.resolveCommands();
            List<Command> parse = simpleLogoParser.parse(commands + NEW_LINE);
            draw(parse);
        } catch (Exception e) {
            consoleService.errorOutput(ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void draw(List<Command> parse) {
        List<String> consolePrintCommands = parse.stream()
                .filter(command -> Type.PRINT.equals(command.getType()))
                .map(command -> ((PrintCommand) command).getText())
                .collect(Collectors.toList());
        consoleService.doPrintCommands(consolePrintCommands);

        List<Line> collect = parse.stream()
                .filter(command -> !Type.PRINT.equals(command.getType()))
                .flatMap(x -> turtleService.draw(x).stream())
                .collect(Collectors.toList());

        turtleImage.setLayoutX(turtle.getX() - 10);
        turtleImage.setLayoutY(turtle.getY() - 10);

        draw_panel.getChildren().addAll(collect);
    }

    public void keyUp() {
        consoleService.keyUp();
    }

    public void keyDown() {
        consoleService.keyDown();
    }

}
