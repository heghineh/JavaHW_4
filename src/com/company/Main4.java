package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        //4 -Get oldest person from the collection

        Map<String, Integer> people = new LinkedHashMap<>();
        people.put("Poghos", 29);
        people.put("Petros", 71);
        people.put("Vagho", 69);
        people.put("Valod", 71);
        people.put("Hrachik", 44);

        Stream<Integer> stream = people.values().stream();

        Integer oldestPersonAge = stream
                .max(Integer::compare).get();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue().equals(oldestPersonAge))
                System.out.println(entry.getKey() + " is the oldest person.");
        }
    }
}