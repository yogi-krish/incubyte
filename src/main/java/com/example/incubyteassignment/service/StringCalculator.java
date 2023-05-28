package com.example.incubyteassignment.service;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int add(String numbers) {

        if(numbers.isEmpty()) {
            return 0;
        }
        if(numbers.startsWith("//")) {
            String delimiter = numbers.charAt(2) + "";
            String actualNumbers = numbers.substring(4, numbers.length());

            return calculateSum(actualNumbers, delimiter);

        }
        else if(numbers.contains(",")) {
            return calculateSum(numbers, ",|/n");
        }
        else
            return Integer.parseInt(numbers);
    }

    public static int to_Int(String str) {
        return Integer.parseInt(str);
    }

    public static int calculateSum(String numbers, String delimiter) {
        String[] numbersArray = numbers.split(delimiter);

        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for(String num : numbersArray) {
            int numValue = to_Int(num);
            sum += numValue;
            if(numValue < 0)
                negatives.add(numValue);
        }

        if(negatives.size() > 0) {
            throw new RuntimeException(message(negatives));
        }
        return sum;
    }

    public static String message(List<Integer> negatives) {
        String str1="negatives not allowed ";
        String str2=negatives.toString().replace("[", "").replace("]", "").replace(",", "");

        return str1+str2;
    }
}
