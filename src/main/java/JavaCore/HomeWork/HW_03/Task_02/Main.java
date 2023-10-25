package JavaCore.HomeWork.HW_03.Task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Ted", 150000);
        Employee employee1 = new Employee("Brad", 50000);
        Employee employee2 = new Employee("Call", 60000);
        Employee employee3 = new Employee("Mat", 70000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(director);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Director.riseSalary(employeeList, 10);

        for (Employee employee: employeeList) {
            System.out.printf("Name: %s, Salary: %.2f\n", employee.getName(), employee.getSalary());
        }
    }
}
