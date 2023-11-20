package Study.JavaCore.Test.Test_03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 4, 1, 8, 6};
        System.out.println(Arrays.toString(array));

        mergeSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int leftLength = middle - left + 1;
        int rightLength = right - middle;

        int[] arrLeft = new int[leftLength];
        int[] arrRight = new int[rightLength];

        System.arraycopy(array, left, arrLeft, 0, leftLength);
        System.arraycopy(array, middle + 1, arrRight, 0, rightLength);

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = left;

        while (leftIndex < leftLength && rightIndex < rightLength) {
            if (arrLeft[leftIndex] <= arrRight[rightIndex]) {
                array[resultIndex] = arrLeft[leftIndex];
                leftIndex++;
            } else {
                array[resultIndex] = arrRight[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < leftLength) {
            array[resultIndex] = arrLeft[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < rightLength) {
            array[resultIndex] = arrRight[rightIndex];
            rightIndex++;
            resultIndex++;
        }

    }
}
