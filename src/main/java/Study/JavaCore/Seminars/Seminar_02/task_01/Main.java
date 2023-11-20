package Study.JavaCore.Seminars.Seminar_02.task_01;

/*
    Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

    Привести функции к корректному виду и дополнительно написать ещё две функции так, чтобы получились
    (четыре) функции поиска минимального и максимального как значения, так и индекса.
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
    }

    public static String maxValue(int[] arr) {
        String result = "";
        int max = 1;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        result += "Значение: " + max + ", " + "Индекс: " + index;
        return result;
    }

    public static String minValue(int[] arr) {
        String result = "";
        int min = 1;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        result += "Значение: " + min + ", " + "Индекс: " + index;
        return result;
    }
}
