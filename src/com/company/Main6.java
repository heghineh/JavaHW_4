package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        //6 - Get names of all kids (under age of 18)

        List<Person> people = Arrays.asList(
                new Person("Poghos", 27),
                new Person("Petros", 12),
                new Person("Valod", 8),
                new Person("Hrachik", 19),
                new Person("Vachik", 18));

        Stream<Person> stream = people.stream();

        List<Person> kids = stream
                .filter(each -> each.getAge() < 18)
                .collect(Collectors.toList());

        System.out.println("Kids are " + kids);
    }
}