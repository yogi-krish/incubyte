package com.example.incubyteassignment.service;

public class StringCalculator {

    public static int add(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }
        else if(numbers.contains(",")) {
            String[] numbersArray = numbers.split(",");
            return Integer.parseInt(numbersArray[0])+Integer.parseInt(numbersArray[1]);
        }
        else
            return Integer.parseInt(numbers);
    }
}
