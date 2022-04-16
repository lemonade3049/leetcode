package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class LargestNumberAfterDigitSwapsByParity2231 {
    public int largestInteger(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if ((chars[i] - chars[j]) % 2 == 0 && chars[i] < chars[j]) {
                    swap(chars, i, j);
                }
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    private void swap(char[] chars, int i, int j) {
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
    }
}
