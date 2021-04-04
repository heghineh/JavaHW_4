package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {
        //9 - Return people names separated by comma

        List<Person> people = Arrays.asList(
                new Person("Poghos", 27),
                new Person("Petros", 12),
                new Person("Valod", 8),
                new Person("Hrachik", 19),
                new Person("Vachik", 18));

        Stream<Person> stream = people.stream();
        String names = stream
                .map(Person::getName)
                .collect(Collectors.joining(", "));

        System.out.println(names);
    }
}