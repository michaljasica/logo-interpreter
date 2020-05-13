package gui.model;

public class Turtle {

    private int x;
    private int y;
    private boolean drawable;
    private double rotation;

    public Turtle(int x, int y, boolean drawable, int rotation) {
        this.x = x;
        this.y = y;
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

}
