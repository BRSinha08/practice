package com.practice.javaeight;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersFromList {
    public static void main(String[] args) {
        count("abt","axyzabt");
    }

    private static void count(String str1, String str2) {
       Map<String,Long> map1 = Arrays.stream(str1.split("")).collect(Collectors.
               groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> map2 = Arrays.stream(str2.split("")).collect(Collectors.
                groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map2.entrySet().stream().filter(e->map1.containsKey
                (e.getKey())).map(Map.Entry::getValue).collect(Collectors.toList()));

    }
}
