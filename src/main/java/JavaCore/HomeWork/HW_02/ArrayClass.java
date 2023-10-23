package JavaCore.HomeWork.HW_02;

public class ArrayClass {

    public static int counter(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count ++;
            }
        }
        return count;
    }

    public static int dif(int[] a) {
        int differ = 0;
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        return differ = max - min;
    }

    public static boolean checkArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && a[i+1] == 0) {
                return true;
            }
        }
        return false;
    }

}
