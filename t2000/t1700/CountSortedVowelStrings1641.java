package com.lemonade.leetcode.t2000.t1700;

@SuppressWarnings("unused")
public class CountSortedVowelStrings1641 {

    public int countVowelStrings(int n) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            arr[0] = arr[0] + 1;
            arr[1] = arr[1] + arr[0];
            arr[2] = arr[2] + arr[1];
            arr[3] = arr[3] + arr[2];
            arr[4] = arr[4] + arr[3];
        }

        return arr[0] + arr[1] + arr[2] + arr[3] + arr[4];

    }
}
