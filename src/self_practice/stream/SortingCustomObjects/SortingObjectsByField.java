package self_practice.stream.SortingCustomObjects;

import java.util.*;
import java.util.stream.Collectors;

public class SortingObjectsByField {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Zack",34,1200);
        Employee employee2 = new Employee("Haden",39,1900);
        Employee employee3 = new Employee("Ali",19,1700);
        Employee employee4 = new Employee("Veli",23,1100);

        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4));

        // sort them by age and get the name list
        List<String> employeeListByAgeOldestToYoungest = employeeList.stream().sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getName)
                .collect(Collectors.toList());

        Collections.reverse(employeeListByAgeOldestToYoungest);

        System.out.println("employeeListByAge = " + employeeListByAgeOldestToYoungest);


        // sort them by salary and get the highest one
        List<String> employeeListBySalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .collect(Collectors.toList());

        String highestPaidEmployeeName = employeeListBySalary.get(employeeListBySalary.size()-1);

        System.out.println("Employee getting highest salary; " + highestPaidEmployeeName);







    }
}
