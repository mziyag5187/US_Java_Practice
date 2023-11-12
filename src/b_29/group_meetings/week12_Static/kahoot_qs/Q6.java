package b_29.group_meetings.week12_Static.kahoot_qs;

public class Q6 {

    private int x = 5; // instance variable

    int m1(){
        int y = x; // CAN NOT access an instance variable from a static method
        return y;
    }

    public static void main(String[] args) {
        //m1(); // can call m1() as staticly imported without class name
              // in the same class since it is static method
    }
}
