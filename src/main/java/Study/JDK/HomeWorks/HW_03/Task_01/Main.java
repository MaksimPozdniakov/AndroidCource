package Study.JDK.HomeWorks.HW_03.Task_01;

import java.util.Iterator;

/*
    1) Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
       возможность хранить любые типы данных, иметь методы добавления и удаления элементов.

    2) Внедрить итератор в нашу коллекцию, таким образом, чтобы итератор был внутренним классом и,
       соответственно, объектом в коллекции.
 */
public class Main {
    public static void main(String[] args) {

        MyCollection<Integer> collection = new MyCollection<>();

        // Добавляем новые элементы
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        System.out.println(collection);
        System.out.println(collection.length());
        System.out.println();

        // удаляем элемент
        collection.remove(2);
        System.out.println(collection);
        System.out.println(collection.length());
        System.out.println();

        // Получаем итератор из коллекции
        Iterator<Integer> iterator = collection.iterator();

        // Используем итератор для обхода элементов коллекции
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }

    }
}
