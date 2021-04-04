package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        //2 - Filter collection so that only elements with less than 4 characters are returned.

        List<String> myString = Arrays.asList("cat", "penguin", "dog", "pig", "dinosaur");
        System.out.println(myString);

        Stream<String> stream = myString.stream();

        List<String> filteredString = stream
                .filter(each -> each.length() < 4)
                .collect(Collectors.toList());

        System.out.println(filteredString);
    }
}