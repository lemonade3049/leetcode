package com.lemonade.leetcode.t1000.t400;

@SuppressWarnings("unused")
public class PowerOfThree326 {

    public static void main(String[] args) {
        for (int i = 0; i < 22; i++) {
            System.out.println((int) Math.pow(3, i));
        }
    }

    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
    }
}
