package gui;

public class Turtle {

    private int x;
    private int y;
    private boolean drawable;
    private int rotation;

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

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

}
