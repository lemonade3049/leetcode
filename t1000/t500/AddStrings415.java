package com.lemonade.leetcode.t1000.t500;

@SuppressWarnings("unused")
public class AddStrings415 {

    public String addStrings(String num1, String num2) {

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        String longOne = num1.length() > num2.length() ? num1 : num2;
        String shortOne = num1.equals(longOne) ? num2 : num1;

        char[] chars = longOne.toCharArray();
        for (int i = 0; i < shortOne.length(); i++) {
            chars[i] += shortOne.charAt(i) - '0';
        }
        int pre = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += pre;
            if (chars[i] > '9') {
                chars[i] -= 10;
                pre = 1;
            } else {
                pre = 0;
            }
            sb.append(chars[i]);
        }
        if (pre == 1) {
            sb.append(pre);
        }

        return sb.reverse().toString();
    }
}
