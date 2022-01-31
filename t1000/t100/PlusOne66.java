package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class PlusOne66 {

    public static void main(String[] args) {
    }
    public static int[] plusOne(int[] digits) {
        int end = -1;
        boolean endFlg = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                end = i;
                endFlg = true;
                break;
            }
        }
        if (!endFlg) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        } else {
            digits[end] += 1;
            for (int i = end + 1; i < digits.length; i++) {
                digits[i] = 0;
            }
            return digits;
        }
    }
}
