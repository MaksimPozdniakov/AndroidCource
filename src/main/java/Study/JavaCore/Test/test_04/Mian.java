package Study.JavaCore.Test.test_04;

import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        Object[] objects = new Object[3];

        int[] ints1 = {1,2,3,4,5};
        int[] ints2= {1,2,3,4,5};
        int[] ints3 = {1,2,3,4,5};
        objects[0] = ints1;
        objects[1] = ints2;
        objects[2] = ints3;

        int d = ((int[]) objects[0])[2];
        System.out.println(d); // выводит третий элемент из массива ints1

//        for (Object obj : objects) {
//            if (obj instanceof int[]) {
//                System.out.println(Arrays.toString((int[]) obj));
//            }
//        }
    }
}
