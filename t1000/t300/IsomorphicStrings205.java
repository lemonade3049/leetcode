package com.lemonade.leetcode.t1000.t300;

@SuppressWarnings("unused")
public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[128];
        int[] b = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] == 0) {
                a[s.charAt(i)] = t.charAt(i);
            } else if (a[s.charAt(i)] != t.charAt(i)) {
                return false;
            }

            if (b[t.charAt(i)] == 0) {
                b[t.charAt(i)] = s.charAt(i);
            } else if (b[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
