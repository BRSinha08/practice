package com.practice.javaeight.ImmutableImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = List.of(new String[]{"Abc", "CDE"});
        Car c = new Car(input);
        c.getNames().add("xyz");
        System.out.println(c.getNames());
        System.out.println(input);

    }
}
