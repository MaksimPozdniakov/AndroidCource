package Study.JavaCore.HomeWork.HW_03.Task_01;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee {
    private String name;
    private String dateBirthday;

    public Employee(String name, String dateBirthday) {
        this.name = name;
        this.dateBirthday = dateBirthday;
    }

    public String getName() {
        return name;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    // через лямбда выражение
//    public static Comparator<Employee> dateComparator = (e1, e2) -> {
//        LocalDate date1 = LocalDate.parse(e1.getDateBirthday());
//        LocalDate date2 = LocalDate.parse(e2.getDateBirthday());
//
//        return date1.compareTo(date2);
//    };

    // через анонимный класс
    public static Comparator<Employee> dateComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            LocalDate date1 = LocalDate.parse(e1.getDateBirthday());
            LocalDate date2 = LocalDate.parse(e2.getDateBirthday());
            return date1.compareTo(date2);
        }
    };

}


