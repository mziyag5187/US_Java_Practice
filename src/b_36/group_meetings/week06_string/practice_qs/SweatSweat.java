package b_36.group_meetings.week06_string.practice_qs;

public class SweatSweat {
    public static void main(String[] args) {

        String str = "Sweat Sweat";

        String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw",1);

        System.out.println(str2);

    }
}
