package Study.JDK.HomeWorks.HW_04;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

    private List<Employee> employees = new ArrayList<>();

    // Добавить метод добавление нового сотрудника в справочник сотрудников
    public void createNewEmployee(String name, String phoneNumber, String workExperience, String serviceNumber) {
        employees.add(new Employee(name,phoneNumber,workExperience,serviceNumber));
    }

    // метод, который ищет сотрудника по стажу (может быть список)
    public void searchByExperience(String workExperience) {
        for (Employee employee: employees) {
            if (employee.getWorkExperience().equals(workExperience)) {
                System.out.println(employee);
            }
        }
    }

    // метод, который выводит номер телефона сотрудника по имени (может быть список)
    public void searchForPhoneNumberByName(String name) {
        for (Employee employee: employees) {
            if (employee.getName().equals(name)) {
                System.out.println(employee.getPhoneNumber());
            }
        }
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public void searchForEmployeeByServiceNumber(String serviceNumber) {
        for (Employee employee: employees) {
            if (employee.getServiceNumber().equals(serviceNumber)) {
                System.out.println(employee);
            }
        }
    }

    public void printList() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
