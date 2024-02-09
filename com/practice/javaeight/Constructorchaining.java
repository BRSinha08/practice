package com.practice.javaeight;

public class Constructorchaining {

     Constructorchaining(int i) {
        new Constructorchaining(3,4);
        System.out.println( i );//2

    }


    Constructorchaining(int i, int j) {
        System.out.println( i );//3
        new Constructorchaining(5,6,7);
        System.out.println( j );//4
    }


    Constructorchaining(int i, int j, int k) {
        System.out.println( i );//5
        System.out.println( j );//6
        System.out.println( k );//7
    }

    public static void main(String[] args) {
        new Constructorchaining(2);
    }
}
