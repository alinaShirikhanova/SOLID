package liskov;

public class Square extends RightAngleShape {
    double sideLength;
    public Square(double centerX, double centerY, double sideLength) {
        super(centerX, centerY);
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
