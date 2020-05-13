package gui;

import command.OneArgCommand;
import gui.model.Turtle;
import javafx.scene.shape.Line;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Optional;
import java.util.function.BiFunction;

public class DrawService {

    public static Optional<Line> draw(Turtle turtle, OneArgCommand command) {
        System.out.println(command.toString());
        Pair<Double, Double> nextPoint = linePoint(turtle, command);
        return generateLine(turtle, nextPoint);
    }

    private static Optional<Line> generateLine(Turtle turtle, Pair<Double, Double> apply) {
        int turtleLastPositionX = turtle.getX();
        int turtleLastPositionY = turtle.getY();
        turtle.setX(turtleLastPositionX - (int) Math.round(apply.a));
        turtle.setY(turtleLastPositionY - (int) Math.round(apply.b));

        return turtle.isDrawable()
                ? Optional.of(new Line(turtleLastPositionX, turtleLastPositionY, turtle.getX(), turtle.getY()))
                : Optional.empty();
    }

    private static BiFunction<Double, Long, Pair<Double, Double>> calculateNextPoint = (rotation, value) -> {
        double x = Math.sin(rotation) * value;
        double y = Math.cos(rotation) * value;
        System.out.println("x: " + x + "y: " + y + "rotation: " + rotation + "sin: " + Math.sin(Math.toRadians(rotation)) + "cos: " + Math.cos(Math.toRadians(rotation)));
        return new Pair<>(x, y);
    };

    public static void main(String[] args) {
        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(90)));
    }


    //TODO
    private static Pair<Double, Double> linePoint(Turtle turtle, OneArgCommand command) {
        switch (command.getType()) {
            case FD:
                return calculateNextPoint.apply(turtle.getRotation(), command.getArgument());
            default:
                return calculateNextPoint.apply(turtle.getRotation(), (-1) * command.getArgument());
        }
    }

}
