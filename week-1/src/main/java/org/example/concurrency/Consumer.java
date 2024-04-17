package org.example.concurrency;

import static org.example.concurrency.Client.BUCKET;

public class Consumer extends Thread {
    @Override
    public void run() {
        synchronized (BUCKET) {
            while (true) {
                try {
                    if (!BUCKET.isEmpty()) {
                        var n = BUCKET.get(0);
                        BUCKET.remove(0);
                        BUCKET.notifyAll();
                        System.out.println(Thread.currentThread().getName() + " "
                                + "Remove value " + n);
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
