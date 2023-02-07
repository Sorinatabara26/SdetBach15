package class5HomeWork;

import java.util.Scanner;

    public class Task7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Country");
            String country=scanner.nextLine();
            switch (country) {
                case "Moldova":
                    System.out.println("You speak Romanian");
                    break;
                case "Italia":
                    System.out.println("You speak Italian");
                    break;
                case "USA":
                    System.out.println("You speak English");
                    break;
                case "China":
                    System.out.println("You speak Chinese");
                    break;
                case "Spania":
                    System.out.println("You speak Spanish");
                    break;

                default:
                    System.out.println("Wrong Country");


            }
        }}

