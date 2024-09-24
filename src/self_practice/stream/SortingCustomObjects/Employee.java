package self_practice.stream.SortingCustomObjects;


public class Employee {

    private String name;
    private int age;

    public int getSalary() {
        return salary;
    }

    private int salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
