package b_29.group_meetings.week03_Variables;

public class IncrementDecrementPractice {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = num1++;
        System.out.println(num1); //???
        System.out.println(num2); //???

        System.out.println("========================");

        int i = 0;
        int j = i++ + ++i;
        System.out.println(i); //???
        System.out.println(j); //???

    }
}
