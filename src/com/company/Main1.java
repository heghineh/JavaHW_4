package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
//1 - Convert elements of a  collection to uppercase.

    public static void main(String[] args) {
        List<String> stringToConvert = Arrays.asList("Hakuna", "matata");
        System.out.println("String:  " + stringToConvert);

        Stream<String> stream = stringToConvert.stream();

        List<String> convertedToUppercase = stream
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("String converted to uppercase:  " + convertedToUppercase);
    }
}