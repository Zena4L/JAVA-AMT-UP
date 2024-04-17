package org.example.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static final List<Integer> BUCKET = new ArrayList<>();

    public static void main(String[] args) {

        Thread c1 = new Consumer();
        Thread p1 = new Producer();

        c1.start();
        p1.start();

    }
}
