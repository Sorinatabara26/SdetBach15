package class5HomeWork;

import java.util.Scanner;

    public class Task8 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your GRADE" );
        String GRADE = scanner.nextLine();
        switch (GRADE){

            case "A":
                System.out.println("Excelent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Bad");
                break;

            default:
                System.out.println("Not acceptable");


        }
    }}


