package b_29.group_meetings.week11_MixedTopics;

public class Test {

    public static void main(String[] args) {

        int one = 'd'/'d';

        for (int i=one; i<='d'; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println('d' + 1);

        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

    }
}

class Person {

    int age;
    String name;

    public Person(){

    }
}