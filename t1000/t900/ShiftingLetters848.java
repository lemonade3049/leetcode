package com.lemonade.leetcode.t1000.t900;

public class ShiftingLetters848 {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3, 5, 9}));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        char[] sArr = s.toCharArray();

        shifts[sArr.length - 1] = shifts[sArr.length - 1] % 26;
        for (int i = sArr.length - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (char) ((sArr[i]  - 'a' +  shifts[i]) % 26 +  'a');
        }

        return String.valueOf(sArr);
    }
}
