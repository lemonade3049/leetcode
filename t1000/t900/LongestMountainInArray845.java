package com.lemonade.leetcode.t1000.t900;

public class LongestMountainInArray845 {

    public static void main(String[] args) {
        new LongestMountainInArray845().longestMountain(new int[]{0, 2, 0, 2, 1, 2, 3, 4, 4, 1});
    }

    public int longestMountain(int[] arr) {
        int increment = 0;
        int decrement = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                if (decrement != 0) {
                    if (increment > 0 && decrement > 0)
                        max = Math.max(max, increment + decrement);
                    increment = 0;
                }
                decrement = 0;
                if (arr[i] != arr[i - 1]) {
                    increment++;
                } else {
                    increment = 0;
                }
            } else if (arr[i] < arr[i - 1]) {
                decrement++;
            }
        }
        if (increment > 0 && decrement > 0)
            max = Math.max(max, increment + decrement);
        if (max == 0) {
            return 0;
        }
        return max + 1;
    }
}
