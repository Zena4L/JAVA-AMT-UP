package org.example.dsa;

public class Fibonnaci {
    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }

        return (i - 1) + fibonacci(i - 2);
    }
}
