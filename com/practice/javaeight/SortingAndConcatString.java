package com.practice.javaeight;

import java.util.Scanner;

public class SortingAndConcatString {

        public static void main(String[] args) {
            System.out.println("Enter a string");
            Scanner sc = new Scanner(System.in);

            String inputStr = sc.next();

            // taking the inputStr, converting it into the list of chars
            // then sorting the list and appending it to
            // the string builder and finally converted
            // into the string.
            String sorted = inputStr
                    .chars()
                    .sorted()
                    .collect(
                            StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append
                    )
                    .toString();
            System.out.println(sorted);
        }
    }

