package Study.JDK.Seminars.Seminar_03.Task_03;

/* TODO разобраться
Этот пример добавляет реализацию интерфейса Iterable<T>, который требуется для создания итератора.
Класс ArrayIterator реализует Iterator<T> и позволяет перемещаться по элементам в массиве коллекции CustomArrayList.
Метод iterator() возвращает новый экземпляр ArrayIterator.
 */

import java.util.Iterator;

public class CustomArrayList<T> implements Iterable<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return (T) elements[currentIndex++];
        }
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println("Using iterator to traverse elements:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
