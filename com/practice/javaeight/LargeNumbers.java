package com.practice.javaeight;

public class LargeNumbers {

    public static void main(String[] args) {
        System.out.println(addNumbers("999","1"));
    }


    public  static  String addNumbers(String num1, String num2){
        StringBuilder str = new StringBuilder();
        String originalNum1 = num1.replaceAll(",","");
        String originalNum2 = num2.replaceAll(",","");
        int i = originalNum1.length()-1,j = originalNum2.length()-1,carry =0,sum;
        while(i>=0 || j>=0||carry>0){
            int digit1 = (i>=0)? Integer.parseInt(String.valueOf(originalNum1.charAt(i--))) :0;
            int digit2 = (j>=0)?originalNum2.charAt(j--)-'0':0;
            sum = digit1+digit2+carry;
            str.append(sum%10);
            if(str.length()%3==0){
                str.append(",");
            }
            carry = sum/10;

        }
        return str.reverse().toString();
    }
}
