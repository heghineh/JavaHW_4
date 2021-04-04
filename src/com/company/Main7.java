package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
        //7-Partition adults and kids

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

        Stream<Person> stream1 = people.stream();

        List<Person> adults = stream1
                .filter(each -> each.getAge() >= 18)
                .collect(Collectors.toList());

        System.out.println("Kids: " + kids + "\nAdults:  " + adults);
    }
}