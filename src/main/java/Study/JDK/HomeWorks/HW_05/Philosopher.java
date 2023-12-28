package Study.JDK.HomeWorks.HW_05;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher implements Runnable {

    private String name;
    private int leftFork;
    private int rightFork;
    private int countEat;
    private Random random;
    private CountDownLatch countDownLatch;
    private Table table;

    public Philosopher(
            String name, int leftFork, int rightFork,
            CountDownLatch countDownLatch, Table table) {

        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.countDownLatch = countDownLatch;
        this.table = table;
        countEat = 0;
        random = new Random();
    }



    @Override
    public void run() {

    }
}
