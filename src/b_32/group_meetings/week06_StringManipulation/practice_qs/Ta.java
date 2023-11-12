package b_32.group_meetings.week06_StringManipulation.practice_qs;

public class Ta {
    public static void main(String[] args) {

        String ta = "A";
        ta = ta.concat("B");

        String tb = "C";
        ta = ta + tb;

        ta.replace('C','D');
        ta = ta + tb;

        System.out.println(ta);


    }
}
