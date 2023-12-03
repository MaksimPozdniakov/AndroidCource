package Study.JDK.HomeWorks.HW_03.Task_01;

import java.util.Iterator;

public class MyCollection<T> {
    private Object[] objects = new Object[5];
    private int size;


    public void add(T t) { // Метод добавления нового элемента
        if (size >= objects.length) {
            Object[] objects2 = new Object[objects.length * 2];
            System.arraycopy(objects, 0, objects2, 0, objects.length);
            objects = objects2;
        }
        objects[size++] = t;
    }

    public void remove(int index){ // Метод удаления нового элемента
        for (int i = index + 1; i < size; i++) {
            objects[i-1] = objects[i];
        }
        size--;
    }

    public int length() {
        return size;
    }

    public String toString(){ // Перегружаем метод toString
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.append(objects[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.append(objects[size-1]);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private class MyIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return (T) objects[currentIndex++];
        }
    }

    public Iterator<T> iterator() { // Метод для создания и возвращения итератора
        return new MyIterator();
    }

}
