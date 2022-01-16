package com.lemonade.leetcode.t1000.t300;

public class FirstBadVersion278 {


    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    
    public static boolean isBadVersion(int t) {
        if (t >= 4) {
            return true;
        }

        return false;
    }

    public static int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int t = l + (r - l) / 2;
            if (isBadVersion(t)) {
                r = t;
            } else {
                l = t + 1;
            }
        }
        return l;
    }
}
