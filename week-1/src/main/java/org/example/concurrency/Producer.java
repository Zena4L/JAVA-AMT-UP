package org.example.concurrency;

import java.util.Random;

import static org.example.concurrency.Client.BUCKET;

public class Producer extends Thread {
    @Override
    public void run() {

        var r = new Random();

        synchronized (BUCKET) {
            while (true) {
                try {
                    if (BUCKET.size() < 100) {
                        var n = r.nextInt(1000);
                        BUCKET.add(n);
                        BUCKET.notifyAll();
                        System.out.println(Thread.currentThread().getName() + " "
                                + "added value " + n);
                    } else {
                        BUCKET.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Could not process");
                }
            }
        }

    }
}
