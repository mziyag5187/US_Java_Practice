package b_36.group_meetings.week13_mixedTopics.method_hiding;

public class Main {

    public static void main(String[] args) {

        Parent.display();  // Outputs: Parent's static method
        Child.display();   // Outputs: Child's static method

        Parent p = new Child();
        p.display();       // Outputs: Parent's static method
    }

}
