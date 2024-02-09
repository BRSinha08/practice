package com.practice.javaeight;

import java.util.HashMap;
import java.util.Map;

public class SortingMapByValueInJava8 {

    public static void main(String[] args) {
        // Creating a Map with electoric items and prices
        Map<String, Integer> ItemToPrice = new HashMap<>();
        ItemToPrice.put("Sony Braiva", 1000);
        ItemToPrice.put("Apple iPhone 6S", 1200);
        ItemToPrice.put("HP Laptop", 700);
        ItemToPrice.put("Acer HD Monitor", 139);
        ItemToPrice.put("Samsung Galaxy", 800);
        System.out.println("unsorted Map: " + ItemToPrice);

        ItemToPrice.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByKey())
                .forEach(System.out::println);

    }
}
