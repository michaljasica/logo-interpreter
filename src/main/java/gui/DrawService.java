package gui;

import command.OneArgCommand;
import gui.model.MaxValue;
import gui.model.Turtle;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;
import java.util.function.BiFunction;

public class DrawService {

    public static List<Line> draw(Turtle turtle, Pane drawPanel, OneArgCommand command) {
        MaxValue maxValue = calculateMaxValue(turtle, command, drawPanel);
        if (command.getArgument() > maxValue.getMaxVal()) {
            ArrayList<Line> lines = new ArrayList<>();
            splitLine(turtle, drawPanel, command, maxValue, lines);
            return lines;
        } else {
            Pair<Double, Double> nextPoint = linePoint(turtle, command);
            return generateLine(turtle, drawPanel, nextPoint);
        }
    }

    private static void splitLine(Turtle turtle, Pane drawPanel, OneArgCommand command, MaxValue maxValue, ArrayList<Line> lines) {
        OneArgCommand newCommand = new OneArgCommand(command.getType(), (long) maxValue.getMaxVal());
        Pair<Double, Double> nextPoint = linePoint(turtle, newCommand);

        lines.addAll(generateLine(turtle, drawPanel, nextPoint));
        newTurtlePosition(turtle, maxValue, drawPanel);
        lines.addAll(draw(turtle, drawPanel, new OneArgCommand(command.getType(), (long) (command.getArgument() - maxValue.getMaxVal()))));
    }

    private static void newTurtlePosition(Turtle turtle, MaxValue maxValue, Pane drawPanel) {
        double rotation = turtle.getRotation() % (2 * Math.PI);

        if (maxValue.getAxis().equals("x")) {

            if ((rotation >= 0 && rotation <= Math.toRadians(90)) || (rotation <= Math.toRadians(-270) && rotation >= Math.toRadians(-360))) {
                turtle.setX(0);
            }

            if ((rotation >= Math.toRadians(-90) && rotation <= Math.toRadians(0)) || (rotation <= Math.toRadians(360) && rotation >= Math.toRadians(270))) {
                turtle.setX((int) drawPanel.getWidth());
            }

            if ((rotation >= Math.toRadians(180) && rotation <= Math.toRadians(270)) || (rotation <= Math.toRadians(-90) && rotation >= Math.toRadians(-180))) {
                turtle.setX((int) drawPanel.getWidth());
            }

            if ((rotation >= Math.toRadians(90) && rotation <= Math.toRadians(180)) || (rotation <= Math.toRadians(-180) && rotation >= Math.toRadians(-270))) {
                turtle.setX(0);
            }


        } else {

            if ((rotation >= 0 && rotation <= Math.toRadians(90)) || (rotation <= Math.toRadians(-270) && rotation >= Math.toRadians(-360))) {
                turtle.setY((int) drawPanel.getHeight());
            }

            if ((rotation >= Math.toRadians(-90) && rotation <= Math.toRadians(0)) || (rotation <= Math.toRadians(360) && rotation >= Math.toRadians(270))) {
                turtle.setY((int) drawPanel.getHeight());
            }

            if ((rotation >= Math.toRadians(180) && rotation <= Math.toRadians(270)) || (rotation <= Math.toRadians(-90) && rotation >= Math.toRadians(-180))) {
                turtle.setY(0);
            }

            if ((rotation >= Math.toRadians(90) && rotation <= Math.toRadians(180)) || (rotation <= Math.toRadians(-180) && rotation >= Math.toRadians(-270))) {
                turtle.setY(0);
            }

        }
    }

    private static boolean rightXaxis(Turtle turtle) {
        double rotation = turtle.getRotation() % Math.PI;
        return rotation >= Math.toRadians(0) && rotation <= Math.toRadians(180);
    }

    private static boolean upYaxis(Turtle turtle) {
        double rotation = turtle.getRotation() % Math.PI;
        return rotation >= Math.toRadians(0) && rotation <= Math.toRadians(90);
    }

    private static List<Line> generateLine(Turtle turtle, Pane drawPanel, Pair<Double, Double> apply) {
        int turtleLastPositionX = turtle.getX();
        int turtleLastPositionY = turtle.getY();

        turtle.setX(turtleLastPositionX - (int) Math.round(apply.a));
        turtle.setY(turtleLastPositionY - (int) Math.round(apply.b));

        return turtle.isDrawable()
                ? Collections.singletonList(new Line(turtleLastPositionX, turtleLastPositionY, turtle.getX(), turtle.getY()))
                : Collections.emptyList();
    }

    private static boolean isTurtlePosition(Turtle turtle, Pane drawPanel) {
        return turtle.getX() <= drawPanel.getWidth() && turtle.getX() >= 0 && turtle.getY() <= drawPanel.getHeight() && turtle.getY() >= 0;
    }

    private static Pair<Double, Double> linePoint(Turtle turtle, OneArgCommand command) {
        switch (command.getType()) {
            case FD:
                return calculateNextPoint.apply((-1) * turtle.getRotation(), command.getArgument());
            default:
                return calculateNextPoint.apply((-1) * turtle.getRotation(), (-1) * command.getArgument());
        }
    }

    private static MaxValue calculateMaxValue(Turtle turtle, OneArgCommand command, Pane drawPanel) {
        switch (command.getType()) {
            case FD:
                return calculateMaxVal.apply(turtle, drawPanel);
            default:
                return new MaxValue("x", 0L);
        }
    }

    private static BiFunction<Double, Long, Pair<Double, Double>> calculateNextPoint = (rotation, value) -> {
        double x = Math.sin(rotation) * value;
        double y = Math.cos(rotation) * value;
        return new Pair<>(x, y);
    };

    private static BiFunction<Turtle, Pane, MaxValue> calculateMaxVal = (turtle, drawPanel) -> {
        double x = 0;
        double y = 0;
        double rotation = turtle.getRotation() % (2 * Math.PI);

        // I quarter
        if ((rotation >= 0 && rotation <= Math.toRadians(90)) || (rotation <= Math.toRadians(-270) && rotation >= Math.toRadians(-360))) {
            x = Math.abs((drawPanel.getWidth() - turtle.getX()) / Math.sin(turtle.getRotation()));
            y = Math.abs(turtle.getY() / Math.cos(turtle.getRotation()));
        }

        // II quarter
        if ((rotation >= Math.toRadians(-90) && rotation <= Math.toRadians(0)) || (rotation <= Math.toRadians(360) && rotation >= Math.toRadians(270))) {
            x = Math.abs(turtle.getX()/ Math.sin(turtle.getRotation()));
            y = Math.abs(turtle.getY() / Math.cos(turtle.getRotation()));
        }

        // III quarter
        if ((rotation >= Math.toRadians(180) && rotation <= Math.toRadians(270)) || (rotation <= Math.toRadians(-90) && rotation >= Math.toRadians(-180))) {
            x = Math.abs(turtle.getX() / Math.sin(turtle.getRotation()));
            y = Math.abs(Math.abs(drawPanel.getHeight() - turtle.getY()) / Math.cos(turtle.getRotation()));
        }

        // IV quarter
        if ((rotation >= Math.toRadians(90) && rotation <= Math.toRadians(180)) || (rotation <= Math.toRadians(-180) && rotation >= Math.toRadians(-270))) {
            x = Math.abs((drawPanel.getWidth() - turtle.getX()) / Math.sin(turtle.getRotation()));
            y = Math.abs(Math.abs(drawPanel.getHeight() - turtle.getY()) / Math.cos(turtle.getRotation()));
        }

        return x < y ? new MaxValue("x", x) :  new MaxValue("y", y);
    };

}
