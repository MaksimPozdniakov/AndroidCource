package Study.JavaCore.HomeWork.HW_04.task_02.categories;

import java.util.Random;

public class Buyer {
    private int id;
    private String buyerName;
    private Random random;

    public Buyer(String buyerName) {
        this.buyerName = buyerName;
        this.id = randomId();
    }

    private int randomId() {
        random = new Random();
        return random.nextInt(10000);
    }

    @Override
    public String toString() {
        return buyerName + "(ID " + id + "):";
    }
}
