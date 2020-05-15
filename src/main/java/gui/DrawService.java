package gui;

import command.OneArgCommand;
import gui.model.Turtle;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;
import java.util.Optional;
import java.util.function.BiFunction;

public class DrawService {

    public static List<Line> draw(Turtle turtle, Pane drawPanel, OneArgCommand command) {
        Pair<Double, Double> nextPoint = linePoint(turtle, command);
        return generateLine(turtle, drawPanel, nextPoint);
    }

    private static List<Line> generateLine(Turtle turtle, Pane drawPanel, Pair<Double, Double> apply) {
        int turtleLastPositionX = turtle.getX();
        int turtleLastPositionY = turtle.getY();

        turtle.setX(turtleLastPositionX - (int) Math.round(apply.a));
        turtle.setY(turtleLastPositionY - (int) Math.round(apply.b));

        if (!isTurtlePosition(turtle, drawPanel)) {
            return splitLine(turtle, drawPanel, turtleLastPositionX, turtleLastPositionY);
        }

        return turtle.isDrawable()
                ? Collections.singletonList(new Line(turtleLastPositionX, turtleLastPositionY, turtle.getX(), turtle.getY()))
                : Collections.emptyList();
    }

    private static List<Line> splitLine(Turtle turtle, Pane drawPanel, int lastX, int lastY) {

        if (turtle.getX() > drawPanel.getWidth()) {
            double newX = turtle.getX() % drawPanel.getWidth();
            double newY = turtle.getY() % drawPanel.getHeight();

            turtle.setX((int) newX);
            turtle.setY((int) newY);

            return Arrays.asList(
                    new Line(lastX, lastY, drawPanel.getWidth(), turtle.getY()),
                    new Line(turtle.getX(), lastY, 0, turtle.getY())
            );
        }

        if (turtle.getX() < 0) {
            double newX = drawPanel.getWidth() - (Math.abs(turtle.getX()) % drawPanel.getWidth());
            double newY = turtle.getY() % drawPanel.getHeight();

            turtle.setX((int) newX);
            turtle.setY((int) newY);

            return Arrays.asList(
                    new Line(lastX, lastY, 0, turtle.getY()),
                    new Line(turtle.getX(), lastY, drawPanel.getWidth(), turtle.getY())
            );
        }

        return Collections.emptyList();
    }

    private static boolean isTurtlePosition(Turtle turtle, Pane drawPanel) {
        return turtle.getX() <= drawPanel.getWidth() && turtle.getX() >= 0 && turtle.getY() <= drawPanel.getHeight() && turtle.getY() >= 0;
    }

    private static BiFunction<Double, Long, Pair<Double, Double>> calculateNextPoint = (rotation, value) -> {
        double x = Math.sin(rotation) * value;
        double y = Math.cos(rotation) * value;
         return new Pair<>(x, y);
    };

    private static Pair<Double, Double> linePoint(Turtle turtle, OneArgCommand command) {
        switch (command.getType()) {
            case FD:
                return calculateNextPoint.apply(turtle.getRotation(), command.getArgument());
            default:
                return calculateNextPoint.apply(turtle.getRotation(), (-1) * command.getArgument());
        }
    }

}
