package com.lemonade.leetcode.t3000;

public class DivideAStringIntoGroupsOfSizeK2138 {
    public static void main(String[] args) {
        new DivideAStringIntoGroupsOfSizeK2138().divideString("abcdefghij", 3, 'X');
    }

    public String[] divideString(String s, int k, char fill) {
        String[] res = new String[(s.length() - 1) / k + 1];
        for (int i = 0; i < res.length - 1; i++) {
            res[i] = s.substring(i * k, i * k + k);
        }
        res[res.length - 1] = s.substring((res.length - 1) * k);
        int j = k - res[res.length - 1].length();
        for (int i = 0; i < j; i++) {
            res[res.length - 1] += String.valueOf(fill);
        }
        return res;
    }
}
