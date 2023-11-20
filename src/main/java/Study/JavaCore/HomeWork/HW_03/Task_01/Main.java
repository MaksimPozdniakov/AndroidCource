package Study.JavaCore.HomeWork.HW_03.Task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Max", "1995-09-17");
        Employee employee2 = new Employee("Yana", "1995-03-18");
        Employee employee3 = new Employee("German", "2023-09-19");
        Employee employee4 = new Employee("Pavel", "1974-07-22");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.sort(Employee.dateComparator);
        for (Employee employee: employeeList) {
            System.out.println("Name: " + employee.getName() + ", Date: " + employee.getDateBirthday());
        }
    }
}
