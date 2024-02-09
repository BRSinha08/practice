package com.practice.javaeight;

// You are using Java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[m];
        int[] B = new int[n];
        Set<Integer> setA = new HashSet<>();
        setA.add(3);
        Set<Integer> setB = new HashSet<>();
        setB.add(5);
        String s = new String("5");

        System.out.println(1 + 10 + s + 1 + 10);//115110
        // ************ Your code goes here!!!!!!! ************
        Set<Integer> result = new HashSet<Integer>(setA);
        for(Integer element:setB){
            if(!result.add(element)){
                result.remove(element);
            }
        }
        System.out.println(result);
    }
}
