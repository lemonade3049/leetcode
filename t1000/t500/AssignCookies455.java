package com.lemonade.leetcode.t1000.t500;

import java.util.Arrays;

public class AssignCookies455 {

    public static void main(String[] args) {
        System.out.println(new AssignCookies455().findContentChildren(new int[]{1, 2}, new int[]{1, 2}));
    }

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = g.length - 1, j = s.length - 1; i >= 0 && j >= 0; i--) {
            if (g[i] <= s[j]) {
                res++;
                j--;
            }
        }

        return res;
    }
}
