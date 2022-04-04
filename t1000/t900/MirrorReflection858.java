package com.lemonade.leetcode.t1000.t900;

@SuppressWarnings("unused")
public class MirrorReflection858 {
    public int mirrorReflection(int p, int q) {
        int t = f(p, q);
        t = p * q / t;

        if (t / p % 2 == 0) {
            return 0;
        } else {
            if (t / q % 2 == 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    int f(int b, int s) {
        while (s != 0) {
            int t = b % s;
            b = s;
            s = t;
        }
        return b;
    }
}
