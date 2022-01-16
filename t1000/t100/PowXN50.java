package com.lemonade.leetcode.t1000.t100;

public class PowXN50 {

    public static void main(String[] args) {
        System.out.println(myPow(2, -1));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        int t = -Math.abs(n);
        int len = 0;
        while (t < 0) {
            t /= 2;
            len++;
        }

        double arr[] = new double[len + 1];
        arr[0] = 1;
        arr[1] = x;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] * arr[i - 1];
        }
        double res = 1;
        len = 1;
        t = -Math.abs(n);
        while (t < 0) {
            if ((t & 1) == 1) {
                if (n > 0) {
                    res *= arr[len];
                } else {
                    res /= arr[len];
                }
            }
            t /= 2;
            len++;
        }
        return res;
    }
}
