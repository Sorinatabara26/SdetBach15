package GroupProject2;

public class CarTester {
    public static void main(String[] args) {

           Truck truck = new Truck(120000,"White",1800);
            System.out.println("Truck price after discount is: " + truck.calculateSalePrice());
            Sedan sedan=new Sedan(50000,"White",18);
            System.out.println("Sedan price after discount is: " + sedan.calculateSalePrice());
        }
    }


