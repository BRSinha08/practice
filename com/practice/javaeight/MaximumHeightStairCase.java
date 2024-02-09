package com.practice.javaeight;

public class MaximumHeightStairCase {
    public static void main(String[] args) {
        System.out.println(height(16));
    }

    private static int height(int N){
        int height = 1;
        while(height<=N) {
            N = N-height;
            height++;
        }
        return height-1;
    }

}
