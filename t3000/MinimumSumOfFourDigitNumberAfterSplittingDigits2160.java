package com.lemonade.leetcode.t3000;

import java.util.Arrays;


@SuppressWarnings("unused")
public class MinimumSumOfFourDigitNumberAfterSplittingDigits2160 {

    public int minimumSum(int num) {
        int [] arr = new int[4];
        arr[0] = num / 1000;
        arr[1] = num / 100 % 10;
        arr[2] = num / 10 % 10;
        arr[3] = num % 10;
        Arrays.sort(arr);

        return 10 * (arr[0] + arr[1]) + arr[2] + arr[3];
    }
}
