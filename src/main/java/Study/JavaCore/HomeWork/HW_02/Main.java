package Study.JavaCore.HomeWork.HW_02;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[] {2, 1, 2, 3, 4};
        int[] secondArray = new int[] {2, 2, 0, 0, 0};
        int[] thirdArray = new int[] {1, 3, 0, 0, 5};

        System.out.println("Задание №1. Найти количество чётных элементов массива");
        int result = ArrayClass.counter(firstArray);
        int result2 = ArrayClass.counter(secondArray);
        int result3 = ArrayClass.counter(thirdArray);
        System.out.println("Массив №1: " + result);
        System.out.println("Массив №2: " + result2);
        System.out.println("Массив №3: " + result3);

        System.out.println();
        System.out.println("Задание №2. Найти разницу между самым большим и самым маленьким элементами массива.");
        int dif1 = ArrayClass.dif(firstArray);
        int dif2 = ArrayClass.dif(secondArray);
        int dif3 = ArrayClass.dif(thirdArray);
        System.out.println("Массив №1: " + dif1);
        System.out.println("Массив №2: " + dif2);
        System.out.println("Массив №3: " + dif3);

        System.out.println();
        System.out.println("Задание №3. Будет истина, если в переданном массиве есть два соседних элемента, " +
                "с нулевым значением");
        boolean check1 = ArrayClass.checkArray(firstArray);
        boolean check2 = ArrayClass.checkArray(secondArray);
        boolean check3 = ArrayClass.checkArray(thirdArray);
        System.out.println("Массив №1: " + check1);
        System.out.println("Массив №2: " + check2);
        System.out.println("Массив №3: " + check3);
    }
}
