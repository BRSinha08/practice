package com.practice.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringSorting {
    public static void main(String[] args) {
        sortCharactersByFrequency("AaAAcccbb");

    }

    public static void sortCharactersByFrequency(String input) {
        StringBuilder str = new StringBuilder();
        Arrays.stream(input.split("")).collect(Collectors.
                groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).forEach((k, v)->{
                if(v>0){
                    str.append(k);
                }
        });
        System.out.println(str);
        /*map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey).forEach(System.out::print);*/
    }
}
