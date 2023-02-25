package b29.practice_tasks;

public class Finra {

    public static void main(String[] args) {

        int number = 11;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(number);
        }
    }
}
