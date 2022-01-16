package com.lemonade.leetcode.t1000.t100;


public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            res = check(res, strs[i]);
        }

        return res;
    }

    public static String check(String s1, String s2) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.length() > s2.length() ? s2 : s1;
    }

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"f1", "s"}));
        System.out.println("".substring(1, 10));
    }
}
