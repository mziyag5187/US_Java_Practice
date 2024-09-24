package b_36.group_meetings.week06_string;

public class ImmutabilityOfString {

    public static void main(String[] args) {

        // Immutability of string

        String str = "Cydeo";

        str.concat(" School");

        System.out.println(str); // ????? Cydeo

        str = str.concat(" School");

        System.out.println(str); // ????? Cydeo School


    }

}
