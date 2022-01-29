package com.lemonade.leetcode.t1000.t100;

public class IntegerToRoman12 {

    public static void main(String[] args) {
        new IntegerToRoman12().intToRoman(1994);
    }

    public String intToRoman(int num) {
        int[] arr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1, 1};
        String[] sArr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i += 2) {
            int n = num / arr[i];
            for (int j = 0; j < n; j++) {
                sb.append(sArr[i]);
            }
            num -= n * arr[i];
            n = num / arr[i + 1];
            if (n == 1) {
                sb.append(sArr[i + 1]);
                num -= arr[i + 1];
            }
        }
        return sb.toString();
    }

}
