package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square (10);
        square.calculateArea();
        square.calculatePerimeter();

    }
}

