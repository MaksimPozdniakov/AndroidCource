package Study.JDK.Seminars.Seminar_04.task_03;

/*
    Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
    Найдите человека с самым маленьким номером телефона
    Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> numberList = new HashMap<>();
        numberList.put("89101234567", "Jack");
        numberList.put("89655555555", "Petter");
        numberList.put("89219876543", "Tom");
        numberList.put("84951112233", "Bob");
        numberList.put("88005553535", "Max");

        // Найдите человека с самым маленьким номером телефона
        // через компаратор
        String minKey = numberList.keySet()
                .stream()
                .min((s1, s2) -> s1.compareTo(s2))
                .get();

        // через сортировку
        String minPhone = numberList.keySet().stream().sorted().findFirst().get();
        System.out.println(numberList.get(minKey));
        System.out.println(numberList.get(minPhone));

        // Найдите номер телефона человека чье имя самое большое в алфавитном порядке
        String maxValue = numberList.entrySet().stream().max((s1, s2) -> s2.getValue().compareTo(s1.getValue())).get().getKey();
        System.out.println(maxValue);

    }
}
