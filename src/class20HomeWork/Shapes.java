package class20HomeWork;
/*Write program: Shape class has a constructor that takes the
        radius and has a subclass as  circle class. In circle class create
 a method to calculate the area of circle. Test your code
        */
public class Shapes {
    double radius;

    Shapes(double radius) {
        this.radius = radius;
    }
}
    class Circle extends Shapes {
        double radius1;

        Circle(double radius, double radius1) {
            super(radius);
            this.radius1 = radius1;
        }


        void area() {
            System.out.println("The area of circle is" + (radius * radius));
        }

    }

