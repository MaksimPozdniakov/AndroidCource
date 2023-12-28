package Study.JDK.HomeWorks.HW_05;

import java.util.concurrent.CountDownLatch;

public class Table implements Runnable {

    private int countPhilosopherAndForks;
    private Fork[] forks;
    private Philosopher[] philosophers;
    private CountDownLatch countDownLatch;

    public Table(int countPhilosopherAndForks) {
        this.countPhilosopherAndForks = countPhilosopherAndForks;
        forks = new Fork[countPhilosopherAndForks];
        philosophers = new Philosopher[countPhilosopherAndForks];

    }

    @Override
    public void run() {

    }
}
