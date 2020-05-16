package gui.model;

public class MaxValue {

    private final String axis;
    private final double maxVal;

    public MaxValue(String axis, double maxVal) {
        this.axis = axis;
        this.maxVal = maxVal;
    }

    public String getAxis() {
        return axis;
    }

    public double getMaxVal() {
        return maxVal;
    }
}
