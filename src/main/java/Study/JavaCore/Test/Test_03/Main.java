package Study.JavaCore.Test.Test_03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 4, 1, 8, 6};
        System.out.println(Arrays.toString(array));

//        mergeSort(array, 0, array.length - 1); // сортировка слиянием
        bubbleSort(array); // сортировка пузырьком
        System.out.printf(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int leftLength = middle - left + 1;
        int rightLength  = right - middle;

        int[] arrLeft = new int[leftLength];
        int[] arrRight = new int[rightLength];

        System.arraycopy(arr, left, arrLeft, 0, leftLength);
        System.arraycopy(arr, middle + 1, arrRight, 0, rightLength);

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = left;

        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (arrLeft[leftIndex] <= arrRight[rightIndex]) {
                arr[resultIndex] = arrLeft[leftIndex];
                leftIndex++;
            } else {
                arr[resultIndex] = arrRight[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < leftLength) {
            arr[resultIndex] = arrLeft[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < rightLength) {
            arr[resultIndex] = arrRight[rightIndex];
            rightIndex++;
            resultIndex++;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
