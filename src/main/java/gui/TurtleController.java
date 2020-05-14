package gui;

import command.Command;
import command.OneArgCommand;
import command.Type;
import gui.model.Turtle;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TurtleController {

    private final Turtle turtle;
    private final Pane drawPanel;
    private final ImageView zolw;

    public TurtleController(Turtle turtle, Pane drawPanel, ImageView zolw) {
        this.drawPanel = drawPanel;
        this.turtle = turtle;
        this.zolw = zolw;
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
                double ltRotation = calculateLTRotation((OneArgCommand) command);
                turtle.setRotation(ltRotation);
                zolw.setRotate((-1) * Math.toDegrees(ltRotation));
                break;
            case RT:
                double rtRotation = calculateRTRotation((OneArgCommand) command);
                turtle.setRotation(rtRotation);
                zolw.setRotate((-1) * Math.toDegrees(rtRotation));
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
            case HT:
                zolw.setVisible(Boolean.FALSE);
                break;
            case ST:
                zolw.setVisible(Boolean.TRUE);
                break;
            case HOME:
                turtle.setHome();
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
