package Study.JDK.Seminars.Seminar_03.Task_01;

/*
Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы
возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса. Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable
(классы оболочки, String), V должен реализовать интерфейс DataInput и расширять класс InputStream,
K должен расширять класс Number
 */

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {

        DataInputStream stream = new DataInputStream(System.in);
        MegaClass megaClass = new MegaClass("eee", stream, 1);
        megaClass.printTypes();
    }
}
