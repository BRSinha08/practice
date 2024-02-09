package com.practice.javaeight;
import java.util.Arrays;
import java.util.Comparator;

public class SortingAndConcatUsingJava7 {

        public static String sortString(String inputString)
        {
            Character[] tempArray
                    = new Character[inputString.length()];

            for (int i = 0; i < inputString.length(); i++) {
                tempArray[i] = inputString.charAt(i);
            }

            Arrays.sort(tempArray, Comparator.comparingInt(Character::toLowerCase));

            StringBuilder sb
                    = new StringBuilder(tempArray.length);

            for (Character c : tempArray)
                sb.append(c.charValue());

            return sb.toString();
        }
        public static void main(String[] args)
        {
            String inputString = "i,love,java";

            String outputString = sortString(inputString);

            System.out.println("Input String : " + inputString);
            System.out.println("Output String : "
                    + outputString);
        }
    }

