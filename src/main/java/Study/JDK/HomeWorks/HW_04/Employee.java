package Study.JDK.HomeWorks.HW_04;

import lombok.Getter;

/*
    Имя
    Номер телефона
    Стаж
    Табельный номер
 */
@Getter
public class Employee {
    private String name;
    private String phoneNumber;
    private String workExperience;
    private String serviceNumber;

    public Employee(String name, String phoneNumber, String workExperience, String serviceNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workExperience = workExperience;
        this.serviceNumber = serviceNumber;
    }

    @Override
    public String toString() {
        return  "Имя='" + name + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", Стаж='" + workExperience + '\'' +
                ", Табельный номер='" + serviceNumber + '\'' +
                '}';
    }
}
