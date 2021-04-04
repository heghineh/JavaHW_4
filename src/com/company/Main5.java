package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        //5 - Sum all elements of a numeric collection

        List<Integer> numbers = Arrays.asList(2, 36, 749, -13, -2);

        Stream<Integer> stream = numbers.stream();

        int sum = stream
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum is " + sum);
    }
}