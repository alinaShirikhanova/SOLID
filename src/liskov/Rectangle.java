package liskov;

public class Rectangle extends RightAngleShape {
    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(double centerX, double centerY, double firstSideLength, double secondSideLength) {
        super(centerX, centerY);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
