package org.example.threadDownload;

public class Download implements Runnable{
    @Override
    public void run() {
        System.out.println("Some files");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File downloaded successfully.");

    }
}
