package com.practice.javaeight;

import java.util.Arrays;

public class MaximumProduct {

    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 6, 7, 0};
        int negativeArr[] = {-1, -3, -6, 3, 0, -5};
        //Output: {8,7}
        maxProduct(negativeArr);

    }

    private static void maxProduct(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();
        int secondMax = Arrays.stream(arr).filter(e -> e != max).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int secondMin = Arrays.stream(arr).filter(e -> e != min).min().getAsInt();

        if(max*secondMax>min*secondMin){
            System.out.println("pair is"+ max+","+secondMax);
        }
        else {
            System.out.println("pair is"+ min+","+secondMin);
        }
        System.out.println("max is" + max + "  , secondMax is" + secondMax + " min is" + min + "secondMin is " + secondMin);
    }
}
