package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class UniquePaths62 {

    public int uniquePaths(int m, int n) {
        int b = Math.max(m, n);
        int s = m == b ? n : m;
        return f(b + s - 2, s - 1);
    }

    int f(int b, int s){
        double res = s == 0 ? 1 : b;
        for(int i = 2; i <= s; i++){
            res *= b - s + i - 1;
            res /= i;
        }
        return (int)res;
    }
}
