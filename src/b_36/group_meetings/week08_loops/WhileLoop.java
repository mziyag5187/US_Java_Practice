package b_36.group_meetings.week08_loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        //The while loop is used when you want to execute a block of code
        // as long as a specified condition is true. It is useful when
        // the number of iterations is not known beforehand.

        //----> Getting user input until a valid input is provided:

        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number > 0) {
                break;
            }
            System.out.println("Invalid input. Try again.");
        }
   }

}

