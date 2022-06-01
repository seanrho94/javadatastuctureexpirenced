package practise;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Sean", "Rho", 43125));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Saad", "", 7777));

        for (Employee i: employeeList) {
            System.out.println(i.getFirstName());
        }

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("Hello1");
        stringList.add("Hello2");

        for (String i: stringList) {
            System.out.println(i);
        }

        employeeList.forEach(employee -> System.out.println(employee.getFirstName()));
        int size = employeeList.size();
        Employee[] employeeArray = employeeList.toArray(new Employee[size]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        Employee mary = employeeList.get(3);
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(mary));

    }
}
