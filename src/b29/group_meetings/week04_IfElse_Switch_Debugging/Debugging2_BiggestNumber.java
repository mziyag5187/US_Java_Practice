package b29.group_meetings.week04_IfElse_Switch_Debugging;

public class Debugging2_BiggestNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("Biggest number is : " + a);
        } else {
            if (b > c) {
                System.out.println("Biggest number is : " + b);
            } else {
                System.out.println("Biggest number is : " + c);
            }

        }


        // Using Ternary

        int biggestNumber = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("(Ternary) Biggest number is : " + biggestNumber);

    }

}
