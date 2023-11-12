package b_32.group_meetings.week05_general_review_till_String.gr_31;

public class ImmutabilityOfString {

    public static void main(String[] args) {

        // Immutability of string

        String str = "Cydeo";

        str.concat(" School");

        System.out.println(str); //

        str = str.concat(" School");

        System.out.println(str); //


    }

}
