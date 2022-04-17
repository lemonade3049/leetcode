package com.lemonade.leetcode.t1000.t700;

@SuppressWarnings("unused")
public class ValidPalindromeII680 {

    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        return f(chars, 0, chars.length - 1, false);
    }

    boolean f(char[] s, int i, int j, boolean b) {
        while (i < j) {
            if (s[i] == s[j]) {
                i++;
                j--;
            } else {
                if (b) {
                    return false;
                }
                return f(s, i, j - 1, true) || f(s, i + 1, j, true);
            }
        }
        return true;
    }
}
