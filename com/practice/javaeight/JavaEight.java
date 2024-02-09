package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEight {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,13,1,4,56,78,44,33,23);
       /* List<Integer> list1 = Arrays.asList(112,113,11,41,516,718,441,331,231);
        mergeList(list,list1).forEach(System.out::println);
        countOccurenceOfEachCharacter("ilovejava");
        String str = "my namwe is ";
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        names.stream().collect(Collectors
                .groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).
                map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);


        Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("map is"+map);*/

        convertListToMap(list);
    }

    private static void convertListToMap(List<Integer> list) {
        System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toMap(Integer::intValue,e-> e * e)));
    }

    private static List<Integer> mergeList(List<Integer> list, List<Integer> list1) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list);
         return mergedList;
    }
private static void countOccurenceOfEachCharacter(String str){
    System.out.println(Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
}
}
