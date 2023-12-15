package Study.JDK.Seminars.Seminar_04.task_01;

import java.util.*;

/*
    Объедините студентов в команды. В рамках выполнения задачи студентам необходимо:
    Создайте коллекцию мужских и женских имен с помощью интерфейса List
    Отсортируйте коллекцию в алфавитном порядке
    Отсортируйте коллекцию по количеству букв в слове
    Разверните коллекцию
 */

public class Main {
    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>(Arrays.asList("Максим", "Яна", "Света", "Рома", "Катя", "Станислав", "Елена"));

        System.out.println(names);

        // Отсортируйте коллекцию в алфавитном порядке
        Collections.sort(names);
        System.out.println(names);

        // Отсортируйте коллекцию по количеству букв в слове
        names.sort(Comparator.comparingInt(String::length)); // первый вариант записи (через компаратор)
        // names.sort((o1, o2) -> o1.length() - o2.length()); // второй вариант записи (через лямбду)
        System.out.println(names);

        // Разверните коллекцию
        System.out.println(names.reversed());
    }
}
