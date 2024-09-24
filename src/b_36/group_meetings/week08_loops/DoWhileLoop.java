package b_36.group_meetings.week08_loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
//***********Do-While Loop********************

        //it guarantees that the loop body will be executed at least once
        // because the condition is checked after the loop body.
        //** Displaying a menu until the user chooses to exit:
        // Since the number of iterations is not known in advance,
        // a while loop is more appropriate.

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);







    }
}
