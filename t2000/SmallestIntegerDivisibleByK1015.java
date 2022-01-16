package com.lemonade.leetcode.t2000;

import java.util.HashSet;
import java.util.Set;

public class SmallestIntegerDivisibleByK1015 {

    public static void main(String[] args) {
        System.out.println(smallestRepunitDivByK(7));
        System.out.println(smallestRepunitDivByK(5337));
    }

    public static int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int remainder = 0;
        for (int i = 0; i < k; i++) {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0) {
                return i + 1;
            }
        }
        return -1;
    }


}
