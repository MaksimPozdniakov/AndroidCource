package Study.JDK.HomeWorks.HW_04;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.createNewEmployee("Maksim", "89267774433", "10 years", "99004433");
        directory.createNewEmployee("Yana", "89268889966", "15 years", "12345678");
        directory.createNewEmployee("German", "89261112255", "5 years", "99995544");
        directory.createNewEmployee("Inna", "89264445566", "12 years", "98556622");
        directory.createNewEmployee("Roman", "89262225588", "11 years", "99445588");

        directory.printList();
        System.out.println();

//        метод, который ищет сотрудника по стажу (может быть список)
        directory.searchByExperience("10 years");
        System.out.println();

//        метод, который выводит номер телефона сотрудника по имени (может быть список)
        directory.searchForPhoneNumberByName("Yana");
        System.out.println();

//        метод, который ищет сотрудника по табельному номеру
        directory.searchForEmployeeByServiceNumber("99445588");



    }
}
