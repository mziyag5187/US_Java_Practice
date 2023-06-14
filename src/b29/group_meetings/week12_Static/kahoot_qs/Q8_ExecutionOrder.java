package b29.group_meetings.week12_Static.kahoot_qs;

public class Q8_ExecutionOrder {

    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    public Q8_ExecutionOrder() {

        System.out.println("Constructor executed");
    }

    /*
    temp object is created inside the main method to show the execution order of the instance block and constructor, which are executed when an instance of the class is created.
    */
    public static void main(String[] args) {
        System.out.println("Main method executed");
       // Q8_ExecutionOrder temp = new Q8_ExecutionOrder();
    }
}
