package gui;

import command.OneArgCommand;
import gui.model.Turtle;
import javafx.scene.shape.Line;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Optional;
import java.util.function.BiFunction;

public class DrawService {

    public static Optional<Line> draw(Turtle turtle, OneArgCommand command) {
        Pair<Double, Double> nextPoint = linePoint(turtle, command);
        return generateLine(turtle, nextPoint);
    }

    private static Optional<Line> generateLine(Turtle turtle, Pair<Double, Double> apply) {
        int turtleLastPositionX = turtle.getX();
        int turtleLastPositionY = turtle.getY();
        turtle.setX((int) Math.round(apply.a) + turtleLastPositionX);
        turtle.setY((int) Math.round(apply.b) + turtleLastPositionY);

        return turtle.isDrawable()
                ? Optional.of(new Line(turtleLastPositionX, turtleLastPositionY, turtle.getX(), turtle.getY()))
                : Optional.empty();
    }

    private static BiFunction<Double, Long, Pair<Double, Double>> calculateNextPoint = (rotation, value) -> {
        double x = Math.cos(rotation) * value;
        double y = Math.sin(rotation) * value;
        return new Pair<>(x, y);
    };

    //TODO
    private static Pair<Double, Double> linePoint(Turtle turtle, OneArgCommand command) {
        switch (command.getType()) {
            case FD:
                return calculateNextPoint.apply((double) turtle.getRotation(), command.getArgument());
            default:
                return calculateNextPoint.apply((double) turtle.getRotation(), (-1) * command.getArgument());
        }
    }

}
