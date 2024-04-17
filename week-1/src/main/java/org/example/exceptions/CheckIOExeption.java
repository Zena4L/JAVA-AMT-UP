package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckIOExeption {
    public static void readFromFile(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                var data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
