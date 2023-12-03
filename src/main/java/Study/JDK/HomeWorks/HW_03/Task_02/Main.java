package Study.JDK.HomeWorks.HW_03.Task_02;

/*
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract(). Параметры этих методов – два
    числа разного типа, над которыми должна быть произведена операция.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5,5));
        System.out.println(Calculator.multiply(5,5));
        System.out.println(Calculator.divide(5,5));
        System.out.println(Calculator.subtract(5,5));
    }
}
