package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class StringToIntegerAtoi8 {
    public static void main(String[] args) {

    }

    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        boolean startFlg = false;
        boolean negFlg = false;
        long res = 0;
        for (char c : arr) {
            if (!startFlg) {
                if (' ' == c) {
                    continue;
                }
                if ('-' == c || '+' == c || (c >= '0' && c <= '9')) {
                    startFlg = true;
                    if ('-' == c) {
                        negFlg = true;
                        continue;
                    } else if ('+' == c) {
                        continue;
                    }
                } else {
                    return 0;
                }
            }

            if (c >= '0' && c <= '9') {
                res = res * 10 + (c - '0');
                if (!negFlg && res >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (negFlg && res >= ((long) Integer.MAX_VALUE) + 1) {
                    return Integer.MIN_VALUE;
                }
            } else {
                return (int) (negFlg ? -res : res);
            }
        }
        return (int) (negFlg ? -res : res);
    }
}

