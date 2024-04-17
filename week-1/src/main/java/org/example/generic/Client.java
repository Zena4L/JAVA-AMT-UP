package org.example.generic;

import static org.example.generic.Validator.validateData;

public class Client {
    public static void main(String[] args) {
        double number = -5.6;
        boolean isPositive = validateData(number, new Validator.PositiveNumberValidation());
        System.out.println("Is " + number + " positive? " + isPositive);

        String text = "Hello, world!";
        boolean isNotEmpty = validateData(text, new Validator.NonEmptyStringValidation());
        System.out.println("Is the string empty? " + isNotEmpty);
    }
}
