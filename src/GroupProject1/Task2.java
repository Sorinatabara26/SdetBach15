package GroupProject1;
import java.util.Scanner;
public class Task2 {

/*Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital for each country.
        (use 2 different loops).*/


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[] countries = new String[5];
            String[] capitals = new String[5];

            for (int i = 0; i < countries.length; i++) {
                System.out.println("Please enter The Countries");
                countries[i] = input.next();
                System.out.println("Please enter the Capitals");
                capitals[i] = input.next();
            }
            for (int j = 0; j < countries.length; j++) {

                System.out.println("The Capital of  " + countries[j] + " is " + capitals[j]);
                System.out.println();
            }
        }
    }



