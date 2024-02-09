package com.practice.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    //print fibnocci series using java 8
    //0,1,1,2,3,5...20

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // System.out.println(printEvenOdd(list));
        fibo(10,0);
      //  System.out.println( printMax(list));
    }


//to seperate even and odd using java8 list

    public static Map<Boolean, List<Integer>> printEvenOdd(List<Integer> list) {


        return list.stream().collect(Collectors.partitioningBy(l -> l % 2 == 0));

    }

    public static Integer printMax(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }

    public static void fibo(int size, int start) {
        List<Integer> integerList= Stream.iterate(new int[]{start, start+1}, t -> new int[]{t[1], t[0] + t[1]}).limit(size).
                map(t -> t[0]).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
