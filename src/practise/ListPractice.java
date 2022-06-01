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



    }
}
