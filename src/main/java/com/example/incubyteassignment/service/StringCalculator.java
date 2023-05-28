package com.example.incubyteassignment.service;

public class StringCalculator {

    public static int add(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }
        else if(numbers.contains(",")) {
            String[] numbersArray = numbers.split(",");

            int sum = 0;
            for(String num : numbersArray) {
                sum += Integer.parseInt(num);
            }

            return sum;
        }
        else
            return Integer.parseInt(numbers);
    }
}
