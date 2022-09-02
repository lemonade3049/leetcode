package com.lemonade.leetcode.t2000.t1400;

@SuppressWarnings("unused")
public class RemovePalindromicSubsequences1332 {

    public int removePalindromeSub(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return 2;
            }
        }
        return 1;
    }
}
