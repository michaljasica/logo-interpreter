package gui;

import antlr.impl.visitor.ExpressionListener;
import command.Command;
import command.OneArgCommand;
import command.Type;
import gui.model.Turtle;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class TurtleService {

    private final static Logger LOGGER = Logger.getLogger(TurtleService.class.getName());

    private final Turtle turtle;
    private final Pane drawPanel;
    private final ImageView turtleImage;

    public TurtleService(Turtle turtle, Pane drawPanel, ImageView turtleImage) {
        this.drawPanel = drawPanel;
        this.turtle = turtle;
        this.turtleImage = turtleImage;
    }

    public List<Line> draw(Command command) {
        if (isDrawableMethod(command)) {
            return DrawService.draw(turtle, drawPanel, (OneArgCommand) command);
        }
        modifyTurtleState(command);
        return Collections.emptyList();
    }

    public Turtle getTurtle() {
        return turtle;
    }

    private void modifyTurtleState (Command command) {
        switch (command.getType()) {
            case LT:
                double ltRotation = calculateLTRotation((OneArgCommand) command);
                turtle.setRotation(ltRotation);
                turtleImage.setRotate(Math.toDegrees(ltRotation));
                break;
            case RT:
                double rtRotation = calculateRTRotation((OneArgCommand) command);
                turtle.setRotation(rtRotation);
                turtleImage.setRotate(Math.toDegrees(rtRotation));
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
                turtleImage.setVisible(Boolean.FALSE);
                break;
            case ST:
                turtleImage.setVisible(Boolean.TRUE);
                break;
            case HOME:
                turtle.setHome();
                break;
            default:
                LOGGER.info("Command not handled!");
        }
    }

    private double calculateLTRotation(OneArgCommand command) {
        return turtle.getRotation() - Math.toRadians(command.getArgument());
    }

    private double calculateRTRotation(OneArgCommand command) {
        return turtle.getRotation() + Math.toRadians(command.getArgument());
    }

    private static boolean isDrawableMethod(Command command) {
        return command.getType().equals(Type.FD) || command.getType().equals(Type.BK);
    }

}
