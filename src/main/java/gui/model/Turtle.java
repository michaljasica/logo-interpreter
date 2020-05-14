package gui.model;

public class Turtle {

    private static int TURTLE_START_X_POSITION = 450;
    private static int TURTLE_START_Y_POSITION = 250;

    private int x;
    private int y;
    private boolean drawable;
    private double rotation;

    public Turtle(boolean drawable, int rotation) {
        this.x = TURTLE_START_X_POSITION;
        this.y = TURTLE_START_Y_POSITION;
        this.drawable = drawable;
        this.rotation = rotation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isDrawable() {
        return drawable;
    }

    public void setDrawable(boolean drawable) {
        this.drawable = drawable;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public void setHome() {
        this.x = TURTLE_START_X_POSITION;
        this.y = TURTLE_START_Y_POSITION;
        this.rotation = 0;
    }

}
