package gui;

import command.Command;
import command.OneArgCommand;
import command.Type;
import gui.model.Turtle;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TurtleController {

    private static final double HALF_PI = Math.PI;

    private final Turtle turtle;
    private final Pane drawPanel;

    public TurtleController(Turtle turtle, Pane drawPanel) {
        this.drawPanel = drawPanel;
        this.turtle = turtle;
    }

    public Optional<Line> draw(Command command) {
        if (isDrawableMethod(command)) {
            return DrawService.draw(turtle, (OneArgCommand) command);
        }
        modifyTurtleState(command);
        return Optional.empty();
    }

    public Turtle getTurtle() {
        return turtle;
    }

    //TODO: FIX LT/RT
    private void modifyTurtleState (Command command) {
        switch (command.getType()) {
            case LT:
                turtle.setRotation(calculateLTRotation((OneArgCommand) command)); //TODO
                break;
            case RT:
                turtle.setRotation(calculateRTRotation((OneArgCommand) command)); //TODO
                break;
            case CS:
                List<Node> collect = drawPanel.getChildren()
                        .stream()
                        .filter(child -> (child instanceof Line)) //TODO
                        .collect(Collectors.toList());
                drawPanel.getChildren().removeAll(collect);
                break;
            default:
                System.out.println(";)");
        }
    }

    private int calculateLTRotation(OneArgCommand command) {
        return (int) ((turtle.getRotation() + Math.toRadians(command.getArgument())) % 2 * Math.PI);
    }

    private int calculateRTRotation(OneArgCommand command) {
        return (int) ((turtle.getRotation() + Math.toRadians(command.getArgument())) % 2 * Math.PI);
    }

    private static boolean isDrawableMethod(Command command) {
        return command.getType().equals(Type.FD) || command.getType().equals(Type.BK);
    }

}
