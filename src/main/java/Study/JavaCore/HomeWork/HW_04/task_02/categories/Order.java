package Study.JavaCore.HomeWork.HW_04.task_02.categories;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int quantity;
    private static Order[] orders = new Order[10];
    private static int size;

    private Object o1;
    private Object o2;

    public Order(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public static Order makePurchase(Object o1, Object o2) {
        if (o1 == null || o2 == null) {
            throw new IllegalArgumentException("Неверные параметры покупки");
        }

        if (size >= orders.length) {
            Order[] orders2 = new Order[orders.length * 2];
            System.arraycopy(orders, 0, orders2, 0, orders.length);
            orders = orders2;
        }

        Order newOrder = new Order(o1, o2);
        orders[size++] = newOrder;
        return newOrder;
    }

    // возвращаем длину
//    public static void getLength() {
//        System.out.println(orders.length);
//    }

    public static void print() {
        for (int i = 0; i < size; i++) {
            if (orders[i] != null) {
                System.out.println(orders[i]);
                quantity++;
            }
        }

        System.out.println();
        System.out.println("Итоговое количество заказов: " + quantity);
    }

    public static List<Object> getOrders() {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                list.add(orders[i]);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return o1 + " " + o2;
    }
}
