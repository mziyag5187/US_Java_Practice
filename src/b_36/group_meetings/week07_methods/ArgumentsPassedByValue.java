package b_36.group_meetings.week07_methods;

public class ArgumentsPassedByValue {

    public static void main(String[] args) {

        int num = 10;

        add10(num); // 20

        System.out.println("num (num variable itself) : " + num);// 10

    }

    public static void add10(int num){
        num = num + 10;
        System.out.println("num (used in the method) : " + num);
    }

}
