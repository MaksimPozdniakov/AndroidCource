package Study.JDK.HomeWorks.HW_05;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread {

    private String name;
    private int leftFork;
    private int rightFork;
    private int countEat;
    private Random random;
    private CountDownLatch countDownLatch;
    private Table table;

    public Philosopher(String name, int leftFork, int rightFork, CountDownLatch countDownLatch, Table table) {

        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.countDownLatch = countDownLatch;
        this.table = table;
        countEat = 0;
        random = new Random();
    }

    private void eat() throws InterruptedException {
        if (table.tryGetForks(leftFork, rightFork)) {
            System.out.println(name + " начал кушать");
            sleep(500);
            table.putFork(leftFork, rightFork);
            System.out.println(name + " Философ покушал и начал думать");
            countEat++;
        }
    }

    private void thinking() throws InterruptedException {
        sleep(500);
    }


    @Override
    public void run() {
        while (countEat < 3) {
            try {
                thinking();
                eat();
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
        countDownLatch.countDown();
    }
}
