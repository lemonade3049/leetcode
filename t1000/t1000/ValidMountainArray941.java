package com.lemonade.leetcode.t1000.t1000;

public class ValidMountainArray941 {
    public boolean validMountainArray(int[] arr) {
        boolean flag = false;
        if (arr[1] < arr[0]) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (!flag) {
                if (arr[i] < arr[i - 1]) {
                    flag = true;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
        }
        return flag;
    }
}
