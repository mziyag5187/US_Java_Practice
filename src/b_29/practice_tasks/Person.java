package b_29.practice_tasks;

public class Person {

    String name;
    String title;
    int age;

    public Person(String name, String title, int age) {
        this.name = name;
        this.title = title;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }
}
