package com.lemonade.leetcode.t1000.t100;

public class MultiplyStrings43 {


    public static void main(String[] args) {
        new MultiplyStrings43().multiply("999", "999");
    }

    public String multiply(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int[] res = new int[arr1.length + arr2.length];
        for (int i = arr1.length - 1; i >= 0; i--) {
            for (int j = arr2.length - 1; j >= 0; j--) {
                res[arr1.length + arr2.length - i - j - 2] += (arr1[i] - '0') * (arr2[j] - '0');
            }
        }
        for (int i = 0; i < res.length - 1; i++) {
            res[i + 1] += res[i] / 10;
            res[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] == 0 && !flag) {
                continue;
            }
            flag = true;
            sb.append(res[i]);
        }
        return sb.toString().length() == 0 ? "0" : sb.toString();
    }
}
