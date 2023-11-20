package Study.JavaCore.Seminars.Seminar_02.task_04;

public class ArrayClass {
    int[] arr = new int[5];
    int size;

    public void add(int number) {
        if (size >= arr.length) {
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        } else {
            arr[size++] = number;
        }
    }

    public int getLength() {
        return arr.length;
    }
}
