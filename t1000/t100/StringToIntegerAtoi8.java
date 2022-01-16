package com.lemonade.leetcode.t1000.t100;

public class StringToIntegerAtoi8 {
    public static void main(String[] args) {
        new StringToIntegerAtoi8().myAtoi("-1 1a");
    }

    public int myAtoi(String s) {
        char[] arr = s.toCharArray();
        boolean startFlg = false;
        boolean negFlg = false;
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!startFlg) {
                if (' ' == arr[i]) {
                    continue;
                }
                if ('-' == arr[i] || '+' == arr[i] || (arr[i] >= 0 && arr[i] <= '9')) {
                    startFlg = true;
                    if ('-' == arr[i]) {
                        negFlg = true;
                        continue;
                    } else if ('+' == arr[i]) {
                        continue;
                    }
                } else {
                    return 0;
                }
            }

            if (startFlg) {
                if (arr[i] >= '0' && arr[i] <= '9') {
                    res = res * 10 + (arr[i] - '0');
                    if (!negFlg && res >= Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if (negFlg && res >= ((long) Integer.MAX_VALUE) + 1) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    return (int) (negFlg ? -res : res);
                }
            }
        }
        return (int) (negFlg ? -res : res);
    }
}

