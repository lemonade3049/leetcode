package com.lemonade.leetcode.t1000.t100;

public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int end = i;

        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        int start = i;
        return end - start;
    }

}
