package com.practice.javaeight;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Capgemini {

    public static void main(String[] args) {

        System.out.println(originalString("aaaa aannnqddtttwebbb"));
    }

   /* private static String shorten(String str, int length){

      *//*  if(str.length()<= length){

                return str;
        }

        else{

            return str.substring(0,length);
        }*//*

        Optional<String> result = Pattern.compile(".{1,}"+length+"}").
                matcher(str).results().map(MatchResult::group).findFirst();
        return result.isPresent()? result.get():"Nothing";



    }*/

    private static  Map<String,Long> originalString(String str){
        Map<String,Long> map = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()));
        StringBuilder stringBuilder = new StringBuilder();
        //a=6,..
map.forEach((k,v)->{

    stringBuilder.append(k).append(v);
});
        System.out.println("Shorten String is   "+stringBuilder);
return map;
    }
}
