package Study.JDK.HomeWorks.HW_05;

import java.util.concurrent.CountDownLatch;

public class Table extends Thread {

    private int countPhilosopherAndForks;
    private Fork[] forks;
    private Philosopher[] philosophers;
    private CountDownLatch countDownLatch;

    public Table(int countPhilosopherAndForks) {
        this.countPhilosopherAndForks = countPhilosopherAndForks;
        forks = new Fork[countPhilosopherAndForks];
        philosophers = new Philosopher[countPhilosopherAndForks];
        countDownLatch = new CountDownLatch(countPhilosopherAndForks);
        init();
    }

    private void init() {
        for (int i = 0; i < countPhilosopherAndForks; i++) {
            philosophers[i] = new Philosopher("Философ №" + (i + 1), i, (i + 1) % countPhilosopherAndForks, countDownLatch, this);
        }

        for (int i = 0; i < countPhilosopherAndForks; i++) {
            forks[i] = new Fork();
        }
    }

    public void putFork(int leftFork, int rightFork) {
        forks[leftFork].setCondition(false);
        forks[rightFork].setCondition(false);
    }

    private void thinking() {
        for (Philosopher philosopher: philosophers) {
            philosopher.start();
        }
    }

    public synchronized boolean tryGetForks(int leftFork, int rightFork) {
        if (!forks[leftFork].isCondition() && !forks[rightFork].isCondition()) {
            forks[leftFork].setCondition(true);
            forks[rightFork].setCondition(true);
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        try {
            thinking();
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
