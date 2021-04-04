package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        //3 - Flatten multidimensional collection

        List<List<String>> myString = Arrays.asList(Arrays.asList("Triceratops", "Tyrannosaurus", "Troodon"),
                Arrays.asList("Tanius", "Torosaurus", "Tenontosaurus"));

        System.out.println("Before linking:  " + myString);

        Stream<List<String>> stream = myString.stream();

        List<String> flatString = stream
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("After linking: " + flatString);
    }
}