package Study.JavaCore.Test.test_07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,4,8,1,33,67,1,222,12,233,34};
        System.out.println(Arrays.toString(array));

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] arr) {
        int length = arr.length;

        for (int i = length / 2 - 1; i >= 0 ; i--) {
            siftDown(arr, length, i);
        }

        for (int i = length - 1; i >= 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            siftDown(arr, i, 0);
        }
    }
    
    public static void siftDown(int[] arr, int lengthHeap, int indexRoot) {
        int maxEl = indexRoot;
        int left = 2 * indexRoot + 1;
        int right = 2 * indexRoot + 2;

        if (left < lengthHeap && arr[left] > arr[maxEl]) {
            maxEl = left;
        }

        if (right < lengthHeap && arr[right] > arr[maxEl]) {
            maxEl = right;
        }

        if (maxEl != indexRoot) {
            int temp = arr[indexRoot];
            arr[indexRoot] = arr[maxEl];
            arr[maxEl] = temp;

            siftDown(arr, lengthHeap, maxEl);
        }
    }

}
