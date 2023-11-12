package b_29.group_meetings.week06_Methods;

public class ArgumentsPassedByValue {

    public static void main(String[] args) {

        int num = 10;
        add10(num);
        System.out.println(num);

    }

    private static void add10(int num){
        num = num + 10;
    }
}
