package JavaCore.HomeWork.HW_04.task_02;

import JavaCore.HomeWork.HW_04.task_02.categories.Buyer;
import JavaCore.HomeWork.HW_04.task_02.categories.Order;
import JavaCore.HomeWork.HW_04.task_02.categories.Product;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Buyer[] buyers = {
                new Buyer("Maksim"),
                new Buyer("Yana"),
                new Buyer("Inna"),
                new Buyer("Karl")};

        Product[] products = {
                new Product("Стакан", 153),
                new Product("Чашка", 123),
                new Product("Тарелка", 179),
                new Product("Миска", 953)};

        Order.makePurchase(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.makePurchase(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.makePurchase(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.makePurchase(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);
        Order.makePurchase(buyers[random.nextInt(buyers.length)], products[random.nextInt(products.length)]);

        System.out.println();
        Order.print();
        totalSumMethod();
        System.out.println();
    }

    private static void totalSumMethod() {
        double totalSum = 0;
        for (Object o: Order.getOrders()) {
            String s = o.toString().replace(":", ",").replace("руб/ш", "")
                    .replace(" ", "");
            String[] as = s.split(",");
            totalSum += Double.parseDouble(as[2]);
        }

        System.out.printf("Итоговая стоимость всех заказов: %.2f руб", totalSum);
    }
}




