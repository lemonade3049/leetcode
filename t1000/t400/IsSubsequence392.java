package com.lemonade.leetcode.t1000.t400;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        int sP = 0;
        int tP = 0;
        while (sP < s.length() && tP < t.length()) {
            if (s.charAt(sP) == t.charAt(tP)) {
                sP++;
            }
            tP++;
        }
        if (sP == s.length()) {
            return true;
        }
        return false;
    }
}
