package b_32.group_meetings.week02;


import java.text.DecimalFormat;

public class MyClass {
    public static void main(String[] args) {

        System.out.println("Hello World"); // sout

        System.out.print("Hello with print   ");

        String name = "Zack";

        System.out.println("name = " + name);  // soutv

        System.err.println("This is an error");

        double num = 23.1599393939;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(num);
        System.out.println(num);
    }
}
