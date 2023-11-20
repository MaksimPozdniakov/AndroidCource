package Study.JavaCore.HomeWork.HW_03.Task_02;

import java.util.List;

public class Director extends Employee {
    public Director(String name, double salary) {
        super(name, salary);
    }

    public static void riseSalary(List<Employee> employeeList, double percent) {
        for (Employee employee: employeeList) {
            if (!(employee instanceof Director)) {
                employee.salary = (employee.salary * ((percent + 100) / 100 ));
            }
        }
    }
}
