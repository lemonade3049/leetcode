package com.lemonade.leetcode.t1000.t400;

public class FirstUniqueCharacterInAString387 {
    public int firstUniqChar(String s) {

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        char[] arrStr = s.toCharArray();
        int index = -1;

        for (int i = arrStr.length - 1; i >= 0; i--) {
            if (arr[arrStr[i] - 'a'] != -1) {
                arr[arrStr[i] - 'a'] = -2;
            } else {
                arr[arrStr[i] - 'a'] = i;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1 && arr[i] != -2)
                res = Math.min(res, arr[i]);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
