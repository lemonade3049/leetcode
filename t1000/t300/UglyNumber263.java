package com.lemonade.leetcode.t1000.t300;

@SuppressWarnings("unused")
public class UglyNumber263 {

    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n /= 2;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            while (n % 5 == 0) {
                n /= 5;
            }
            return n == 1;
        }
    }
}
