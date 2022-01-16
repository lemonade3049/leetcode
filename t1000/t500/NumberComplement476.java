package com.lemonade.leetcode.t1000.t500;

public class NumberComplement476 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31));
    }

    public int findComplement(int num) {

        for (int i = 0; i < 31; i++) {
            if ((1 << i) > num) {
                return (1 << i) - num - 1;
            }
        }
        return Integer.MAX_VALUE - num;
    }
}
