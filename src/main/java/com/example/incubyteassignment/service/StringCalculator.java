package com.example.incubyteassignment.service;

public class StringCalculator {

    public static int add(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }
        if(numbers.startsWith("//")) {
            String delimiter = numbers.charAt(2) + "";
            String actualNumbers = numbers.substring(4, numbers.length());
            String[] numbersArray = actualNumbers.split(delimiter);

            int sum = 0;
            for(String num : numbersArray) {
                sum += to_Int(num);
            }

            return sum;

        }
        else if(numbers.contains(",")) {
            String[] numbersArray = numbers.split(",|/n");

            int sum = 0;
            for(String num : numbersArray) {
                sum += to_Int(num);
            }
            return sum;
        }
        else
            return Integer.parseInt(numbers);
    }

    public static int to_Int(String str) {
        return Integer.parseInt(str);
    }
}
