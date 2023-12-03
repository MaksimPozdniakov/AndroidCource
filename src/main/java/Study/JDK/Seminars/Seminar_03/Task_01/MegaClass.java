package Study.JDK.Seminars.Seminar_03.Task_01;

import java.io.DataInput;
import java.io.InputStream;

public class MegaClass <T extends Comparable, V extends InputStream & DataInput, K extends Number> {

    private final T t;
    private final V v;
    private final K k;

    public MegaClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printTypes() {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
        System.out.println(k.getClass().getSimpleName());
    }

}
