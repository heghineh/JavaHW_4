package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) {
        //8 - Group people by nationality

        List<Person> people = Arrays.asList(
                new Person("Poghos", 27, "Armenian"),
                new Person("Volodya", 12, "Russian"),
                new Person("Chen", 8, "Chinese"),
                new Person("Hrachik", 19, "Armenian"),
                new Person("Dong", 18, "Chinese"));

        Stream<Person> stream = people.stream();

        Map<String, List<Person>> peopleByNationalities = stream
                .collect(Collectors.groupingBy(Person::getNationality));

        System.out.println(peopleByNationalities);
    }
}