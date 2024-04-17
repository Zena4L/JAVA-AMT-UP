package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
