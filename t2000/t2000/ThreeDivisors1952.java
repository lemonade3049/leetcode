package com.lemonade.leetcode.t2000.t2000;

public class ThreeDivisors1952 {
    public boolean isThree(int n) {
        if (n < 4) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) {
            return false;
        }
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
