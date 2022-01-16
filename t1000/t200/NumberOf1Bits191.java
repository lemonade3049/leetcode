package com.lemonade.leetcode.t1000.t200;

public class NumberOf1Bits191 {

    public static void main(String[] args) {
        System.out.println(new NumberOf1Bits191().hammingWeight(5));
    }

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n >>>= 1;
        }
        return res;
    }
}
