package com.lemonade.leetcode.t2000.t1800;

public class MinimumChangesToMakeAlternatingBinaryString1758 {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int odd = arr.length / 2;
        int even = arr.length - odd;

        int oddOne = 0;
        int evenOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                if (i % 2 == 0) {
                    evenOne++;
                } else {
                    oddOne++;
                }
            }
        }

        return Math.min(even - evenOne + oddOne, odd - oddOne + evenOne);
    }
}
