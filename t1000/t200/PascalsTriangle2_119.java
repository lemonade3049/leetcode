package com.lemonade.leetcode.t1000.t200;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2_119 {

    public static void main(String[] args) {
        generate(33);
    }

    public static List<Integer> generate(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int[] dp = new int[rowIndex + 1];

        for (int i = 0; i <= rowIndex; i++) {
            dp[0] = 1;
            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        for (int i = 0; i <= rowIndex; i++) {
            res.add(dp[i]);
        }
        return res;
    }
}
