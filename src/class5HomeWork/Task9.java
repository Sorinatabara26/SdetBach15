package class5HomeWork;
import java.util.Scanner;
public class Task9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter 1 numbers");
            int num1= scan.nextInt();
            System.out.println("Please enter operator (+,-,*,/)");
            char operator =scan.next().charAt(0);
            System.out.println("Please enter 2 numbers");
            int num2= scan.nextInt();
            switch (operator) {
                case '+' :
                    System.out.println(num1 + num2);
                    break;
                case '-' :
                    System.out.println(num1 - num2);
                case '/' :
                    System.out.println(num1 / num2);
                    break;
                case '*' :
                    System.out.println(num1 * num2);
                    break;
                default:
                    System.out.println("wrong");


            }

        }}


