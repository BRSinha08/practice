package com.practice.javaeight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class StringBrackets {

    /*Write a Java program that checks if a given string contains properly closed parentheses.

    The program should consider different types of parentheses, including (), [], and {}.

    The program should return true if all parentheses in the string are properly closed, and false otherwise.


    Sample Input/Output:
    Input: "[if() "ttttt"]{}", Output: true
    Input: "([)]", Output: false*/
    public static void main(String[] args) {
        boolean status = brackets("[if() \"ttttt\"]{}");
        System.out.println(status);
    }
    private static boolean brackets(String str){

        HashMap<Character,Character> mapOfClose = new HashMap<>();
        mapOfClose.put(')','(');
        mapOfClose.put('}','{');
        mapOfClose.put(']','[');
        HashSet<Character> setofOpen = new HashSet<>(mapOfClose.values());
        Stack<Character> characterStack = new Stack<>();
        System.out.println(setofOpen);
        char[] chars = str.toCharArray();
        for(int i =0;i< chars.length;i++){
            char charac = chars[i];
            if(setofOpen.contains(charac)){
                characterStack.push(charac);
            }
            else{
                if(characterStack.empty()){
                    return false;
                }
                if(mapOfClose.get(charac)!= characterStack.peek()){
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }


}
