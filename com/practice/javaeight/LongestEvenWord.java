package com.practice.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LongestEvenWord {

    public static void main(String[] args) {
        System.out.println(findWord("Be not afraid of greatness , some are born great , some achieve greatness ," +
                " and some have greatness thrust upon them"));
    }

    private static String findWord(String str){
        int max =0;


        return Stream.of((str.split("\\s"))).
                filter(e->e.length()%2==0).max(Comparator.comparingInt(String::length)).get();


    }

}
