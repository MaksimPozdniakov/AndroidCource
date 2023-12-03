package Study.JDK.HomeWorks.HW_03.Task_04;

/*
    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь
    методы getFirst(), getSecond() для получения значений пары, а также переопределение метода toString(),
    возвращающее строковое представление пары.
 */

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Строка", 5);
        System.out.println(pair.getFirst() + " (" + pair.getFirst().getClass().getSimpleName() + ")");
        System.out.println(pair.getSecond() + " (" + pair.getSecond().getClass().getSimpleName() + ")");
        System.out.println(pair.toString());
    }
}
