package ie.atu.week7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> orderID = new ArrayList<>();
        ArrayList<String> name= new ArrayList<>();
        ArrayList<String> product = new ArrayList<>();
        ArrayList<Integer> quan = new ArrayList<>();

        int active = 1;

        Scanner scanner = new Scanner(System.in);

        while (active == 1) {
        System.out.println("A: Add Order");
        System.out.println("U: Update Order");
        System.out.println("D: Display All Orders");
        System.out.println("E: Exit");

        String input = scanner.next();
            switch (input) {
                case "A":
                case "a":
                    try {
                        System.out.println("Enter order id");
                        String ID = scanner.next();
                        orderID.add(ID);

                        System.out.println("Enter your name");
                        String Name = scanner.next();
                        name.add(Name);

                        System.out.println("Enter your product");
                        String Product = scanner.next();
                        product.add(Product);

                        System.out.println("Enter the quantity");
                        int quantity = scanner.nextInt();
                        quan.add(quantity);

                        System.out.println("You've entered");
                        Order printOrder = new Order(ID, Name, Product, quantity);
                        System.out.println(printOrder.toString());
                        break;
                    }
                    catch (InputMismatchException e){
                        System.out.println("Error you " + e.getMessage());
                    }

                case "U":
                case "u":
                    System.out.println("Please enter your order ID");
                    String matchId = scanner.next();
                    break;

                case "D":
                case "d":
                    System.out.println("Order ID list\n");
                    int index = 1;
                    for (String id : orderID){
                        System.out.println("Order " + index);
                        System.out.println(id + "\n");
                        index++;
                    }
                    break;

                case "E":
                case "e":
                    System.out.println("You've exited the program");
                    active = 0;
                    break;

                default:
                    System.out.println("Invalid operation, try again.\n");
            }
        }

    }
}
