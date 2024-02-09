package com.practice.javaeight;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Wipro {

    public static void main(String[] args) {
        String str = "I am a Java Develper";
        System.out.println( Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream().filter(v->v.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList()));

    }
}
