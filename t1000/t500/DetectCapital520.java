package com.lemonade.leetcode.t1000.t500;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        boolean first = false;
        boolean second = false;
        char[] arr = word.toCharArray();
        if (arr[0] >= 'A' && arr[0] <= 'Z') {
            first = true;
        }

        if (arr[1] >= 'A' && arr[1] <= 'Z') {
            second = true;
        }

        if (!first && second) {
            return false;
        }

        for (int i = 2; i < arr.length; i++) {
            if (first && second) {
                if (arr[i] > 'Z') {
                    return false;
                }
            } else if ((first && !second) || (!first && !second)) {
                if (arr[i] <= 'Z') {
                    return false;
                }
            }
        }
        return true;
    }
}
