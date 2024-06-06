package b_36.group_meetings.week03_variables;

public class VariablesReviewNotes {

    public static void main(String[] args) {

        //**final keyword (you will learn further info about it later)
            final int birthYear = 2014;
            //birthYear = 2016; // compile error since we can not reassign a value

        System.out.println("========================================");

        //When you use data types like short or byte and use some arithmetic operators
        // the values are changed to int,so the result of the operation is also int
        short short1 = 5;
        short short2 = 4;
        short result = (short) (short1 + short2);
        //System.out.println(result);




    }
}
