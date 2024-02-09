package com.practice.javaeight;

import java.util.Arrays;

public class Demo {

    //{19,45, 69,78,92,53}

    public static void main(String[] args) {
        int [] arr = {19,45, 69,78,92,53};

        int first= Arrays.stream(arr).boxed().max(Integer::compare).get();
        int second= Arrays.stream(arr).boxed().filter(e->e!=first).max(Integer::compare).get();
        int third= Arrays.stream(arr).boxed().filter(e->e!=first).filter(k->k!=second).max(Integer::compare).get();

        System.out.println("First Value is "+first+", "+ "Second Value is "+second+", "+ "Third is"+ third);





    }
}
