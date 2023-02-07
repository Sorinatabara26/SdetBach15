package class5HomeWork;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What score do you have?");
            int score = input.nextInt();
            if (score >= 90) {
                System.out.println("Grade=A");
            } else if  (score >= 70 && score > 90){
                System.out.println("Grade=B");
            } else if (score >=50 && score<70 ){
                System.out.println("Grade C");
            } else if  ( score <50 ){
                System.out.println("Grade F");}

        }
}



