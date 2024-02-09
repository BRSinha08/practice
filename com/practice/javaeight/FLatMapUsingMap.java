package com.practice.javaeight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FLatMapUsingMap {

    private static void print(Map<String, List<String>> map){
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        map.forEach((k,v)-> v.stream().map(Long::valueOf).forEach(e->{
            if(e%2==0 && e%3!=0){
                s1.append("H");
            } else if (e%3==0 && e%2!=0) {
                s1.append("W");
            } else if (e % 2 == 0) {
                s1.append("HW");
            }
            else {
                s1.append(e);
            }
        }));

        System.out.println("s1::"+s1);

        map.entrySet().stream().
                flatMap(x-> x.getValue().stream()).map(Long::valueOf).forEach(e->{
                    if(e%2==0 && e%3!=0){
                        s.append("H");
                    } else if (e%3==0 && e%2!=0) {
                        s.append("W");
                    } else if (e % 2 == 0) {
                        s.append("HW");
                    }
                    else {
                        s.append(e);
                    }
                });
        System.out.println(s);

    }

    public static void main(String[] args) {
        Map<String,List<String>> peoplePhoneNum = new HashMap<>();
        peoplePhoneNum.put("Ramesh", Arrays.asList("9771230112", "9894563389","6"));
        peoplePhoneNum.put("Suresh", Arrays.asList("8996781224", "9866225264", "8866225564","12"));
        peoplePhoneNum.put("Mahesh", Arrays.asList("9886786654", "9861243242"));
        print(peoplePhoneNum);
    }
}
