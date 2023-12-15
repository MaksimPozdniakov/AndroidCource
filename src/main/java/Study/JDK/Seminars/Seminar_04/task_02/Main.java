package Study.JDK.Seminars.Seminar_04.task_02;

/*
    Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
    Получите уникальный список Set на основании List
    Определите наименьший элемент (алфавитный порядок)
    Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
    Удалите все элементы содержащие букву ‘A’
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names =
                new ArrayList<>(Arrays.asList("Максим", "Яна", "Максим", "Яна", "Катя", "Станислав", "Катя", "Том"));
        System.out.println(names);

        // Получите уникальный список Set на основании List
        Set<String> setNames = new HashSet<>(names);
        System.out.println(setNames);

        // Определите наименьший элемент (алфавитный порядок)
        String minName = setNames.stream().min((e1, e2) -> e1.compareTo(e2)).get();
        System.out.println(minName);

        // Определите наибольший элемент (по количеству букв в слове, но в обратном порядке)
        String maxName = setNames.stream().max(Comparator.comparingInt(String::length)).get();
        StringBuilder reversedStr = new StringBuilder(maxName).reverse();
        System.out.println(reversedStr);

        // Удалите все элементы содержащие букву ‘A’
        // первый вариант записи (через цикл)
        List<String> list = new ArrayList<>();
        for (String name: names) {
            if (!name.contains("А") && !name.contains("а")) {
                list.add(name);
            }
        }
        System.out.println(list);

        // второй вариант записи (через итератор)
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String currentName = iter.next();
            if (currentName.contains("а")) {
                iter.remove();
            }
        }
        // через лямбду
        names.removeIf(currentName -> currentName.contains("а"));
        System.out.println(names);
    }
}
