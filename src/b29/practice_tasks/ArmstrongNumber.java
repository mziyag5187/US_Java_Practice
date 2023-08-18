package b29.practice_tasks;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 407;

        System.out.println("isArmstrong(number) = " + isArmstrong(number));


    }

    public static boolean isArmstrong(int number){
        String numberStr = String.valueOf(number);
        int result = 0;

        char[] lettersAsNumberList = numberStr.toCharArray();

        for ( Character each : lettersAsNumberList){
            int num = Integer.valueOf(each+"");
            result += Math.pow(num,3);
        }

        return (result==number);
    }

}
