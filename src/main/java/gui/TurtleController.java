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

    private void modifyTurtleState (Command command) {
        switch (command.getType()) {
            case LT:
                turtle.setRotation(calculateLTRotation((OneArgCommand) command));
                break;
            case RT:
                turtle.setRotation(calculateRTRotation((OneArgCommand) command));
                break;
            case CS:
                List<Node> collect = drawPanel.getChildren()
                        .stream()
                        .filter(child -> (child instanceof Line))
                        .collect(Collectors.toList());
                drawPanel.getChildren().removeAll(collect);
                break;
            case PD:
                turtle.setDrawable(Boolean.TRUE);
                break;
            case PU:
                turtle.setDrawable(Boolean.FALSE);
                break;
            default:
                System.out.println(";)");
        }
    }

    private double calculateLTRotation(OneArgCommand command) {
        return turtle.getRotation() + Math.toRadians(command.getArgument());
    }

    private double calculateRTRotation(OneArgCommand command) {
        return turtle.getRotation() - Math.toRadians(command.getArgument());
    }

    private static boolean isDrawableMethod(Command command) {
        return command.getType().equals(Type.FD) || command.getType().equals(Type.BK);
    }

}
