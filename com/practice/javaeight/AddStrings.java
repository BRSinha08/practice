package com.practice.javaeight;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("123456789","123456789"));
    }
        public static String addStrings(String num1, String num2) {
            StringBuilder str = new StringBuilder();
           // String originalNum1 = num1.replaceAll(",","");
            //String originalNum2 = num1.replaceAll(",","");

            int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

            while (i >= 0 || j >= 0 || carry > 0) {
                int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
                int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

                sum = digit1 + digit2 + carry;
                str.append(sum % 10);
                carry = sum / 10;
            }

            return str.reverse().toString();
        }
    }
