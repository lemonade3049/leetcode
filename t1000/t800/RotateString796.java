package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class RotateString796 {

    public boolean rotateString(String s, String goal) {
        char[] sChars = s.toCharArray();
        char[] goalChars = goal.toCharArray();

        if (sChars.length != goalChars.length) {
            return false;
        }

        outer:
        for (int i = 0; i < sChars.length; i++) {
            for (int j = 0; j < sChars.length; j++) {
                if (sChars[j] != goalChars[i + j >= sChars.length ? i + j - sChars.length : i + j]) {
                    continue outer;
                }
            }
            return true;
        }
        return false;
    }
}
