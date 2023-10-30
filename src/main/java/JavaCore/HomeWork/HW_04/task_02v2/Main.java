package JavaCore.HomeWork.HW_04.task_02v2;

import JavaCore.HomeWork.HW_04.task_02v2.categories.Buyer;
import JavaCore.HomeWork.HW_04.task_02v2.categories.Order;
import JavaCore.HomeWork.HW_04.task_02v2.categories.Product;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Buyer[] buyers = {
                new Buyer("Maksim1"),
                new Buyer("Maksim2"),
                new Buyer("Maksim3"),
                new Buyer("Maksim4")};

        Product[] products = {
                new Product("Стакан", 153),
                new Product("Чашка", 123),
                new Product("Тарелка", 179),
                new Product("Миска", 953)};

//        Order.addNewOrder(null, products[random.nextInt(products.length)]); // проверка на неверно переданные данные
        Order.addNewOrder(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.addNewOrder(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.addNewOrder(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.print();

        totalSumMethod();
    }

    private static void totalSumMethod() {
        int totalSum = 0;
        for (Object o: Order.getOrders()) {
            String s = o.toString().replace(":", ",").replace("руб/ш", "")
                    .replace(" ", "");
            String[] as = s.split(",");
            totalSum += Integer.parseInt(as[2]);
        }

        System.out.printf("Итоговая стоимость всех заказов: %d руб", totalSum);
    }
}




