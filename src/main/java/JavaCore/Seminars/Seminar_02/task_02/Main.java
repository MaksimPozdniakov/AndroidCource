package JavaCore.Seminars.Seminar_02.task_02;

/*
    Создать квадратный целочисленный массив (количество строк и
    столбцов одинаковое), заполнить его диагональные элементы единицами,
    используя цикл(ы)
 */

public class Main {
    public static void main(String[] args) {
        fillArray(5);

    }

    public static void fillArray(int size) {
        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



}
