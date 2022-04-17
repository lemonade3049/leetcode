package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class CountIntegersWithEvenDigitSum2180 {

    public static void main(String[] args) {
        System.out.println(new CountIntegersWithEvenDigitSum2180().countEven(4));
    }

    public int countEven(int num) {
        int res = 0;
        for (int i = 2; i <= num; i++) {
            if (f(i)) {
                res++;
            }
        }
        return res;
    }

    private boolean f(int i) {
        int total = 0;
        while (i > 0) {
            total += i % 10;
            i /= 10;
        }
        return total % 2 == 0;
    }
}
