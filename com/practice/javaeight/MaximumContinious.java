package com.practice.javaeight;

public class MaximumContinious {
    private static void findMaxSum(int[] arr){

        int [] arr1 = new int[arr.length];
        arr1[0] = arr[0];

        int maxSum = arr[0];

        for(int i =1;i< arr.length;i++){

            arr1[i] = Math.max(arr[i],arr[i]+arr1[i-1]);
            maxSum = Math.max(maxSum,arr1[i]);
        }

        System.out.println(maxSum);


    }


    public static void main(String[] args) {


        int[] arr = {-1, -2, -3, -4};

        findMaxSum(arr);

    }
}
