package GroupProject2;
/*Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculate Perimeter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.*/
public interface Shape {
    void calculateArea();
     void calculatePerimeter();
}


class Circle implements Shape {

    double radius;

    Circle (double radius) {
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14*radius*radius);
    }

    @Override
    public void calculatePerimeter() {

        System.out.println(2*3.14*radius);

    }
}

class Square implements Shape {

    int side;

    Square (int side) {
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {

        System.out.println(4*side);

    }
}
