package class5HomeWork;
import java.util.Scanner;

    public class Task4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your birth month");
            String month=input.nextLine();

            if( month.equals("January") || month.equals("February") || month.equals("December")){
                System.out.println("You were born in winter");
            }else if ( month.equals("March") || month.equals("April") || month.equals("May")) {
                System.out.println("You are born in Spring");
            } else if (month.equals("June" )|| month.equals("July" )|| month.equals("August")) {
                System.out.println("You are born in Summer");
            }else if (month.equals("September")|| month.equals("October") || month.equals("November")){
                System.out.println("You are born in Autumn");
            }
        }
    }

