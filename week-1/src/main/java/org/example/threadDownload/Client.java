package org.example.threadDownload;

public class Client {
    public static void main(String[] args) {
        Runnable r1 = new Task();
        Runnable r2 = new Task();
        Thread t1 = new Thread(r1, "Task 1");
        Thread t2 = new Thread(r1, "Task 2");

        t1.start();
        t2.start();

        System.out.println("Some activities" + " " + Thread.currentThread().getName());
    }
}
