package com.practice.javaeight;

import java.util.Arrays;

public class RunningSum {

    //Input nums =[3,1,2,10,1]
    //Output: [3,4,6,16,17]

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,10,1};
        sum(arr);

    }

    private static void sum(int[] arr){
        for(int i = 1; i<arr.length;i++){
            arr[i]= arr[i] + arr[i-1];
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

}
