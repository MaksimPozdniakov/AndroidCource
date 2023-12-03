package Study.JDK.HomeWorks.HW_03.Task_03;

/*
    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
    и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину
    и содержать элементы одного типа
 */

public class Main {
    public static void main(String[] args) {
        Integer[] ints1 = new Integer[5];
        Integer[] ints2 = new Integer[5];
        String[] strings1 = new String[5];
        String[] strings2 = new String[5];

        MyArray myArray = new MyArray();
        System.out.println(myArray.compareArrays(ints1, ints2));
        System.out.println(myArray.compareArrays(strings1, strings2));
        System.out.println(myArray.compareArrays(strings1, ints1));
    }
}
