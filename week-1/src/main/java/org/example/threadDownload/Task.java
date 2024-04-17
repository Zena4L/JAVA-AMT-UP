package org.example.threadDownload;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Processing data...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data processed successfully.");
    }
}
