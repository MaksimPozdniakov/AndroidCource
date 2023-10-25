package JavaCore.Seminars.Seminar_02.task_04;

public class Main {

    /*
    Написать функцию добавления элемента в конец массива таким образом, чтобы она расширяла массив при необходимости.
    Функция должна возвращать ссылку на вновь созданный внутри себя массив, а не использовать глобальный.
     */
    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();
        arrayClass.add(1);
        arrayClass.add(2);
        arrayClass.add(3);
        arrayClass.add(4);
        arrayClass.add(5);
        arrayClass.add(5);
        System.out.println(arrayClass.getLength());
    }

}
