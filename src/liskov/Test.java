package liskov;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 4, 4, 6);
        Square square = new Square(10, 12, 3);
        square.setFirstSideLength(90);
        System.out.println(square.getFirstSideLength());
        System.out.println(square.getSecondSideLength());
    }
}
