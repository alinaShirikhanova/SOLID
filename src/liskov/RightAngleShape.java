package liskov;

public abstract class RightAngleShape {
    protected double centerX;
    protected double centerY;

    public RightAngleShape(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
}
