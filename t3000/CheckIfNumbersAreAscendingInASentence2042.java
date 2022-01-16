package com.lemonade.leetcode.t3000;

public class CheckIfNumbersAreAscendingInASentence2042 {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int pre = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) >= '0' && arr[i].charAt(0) <= '9') {
                int curr = Integer.valueOf(arr[i]);
                if (pre >= curr) {
                    return false;
                }
                pre = curr;
            }
        }
        return true;
    }
}
