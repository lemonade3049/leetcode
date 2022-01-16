package com.lemonade.leetcode.t3000;

public class SolvingQuestionsWithBrainpower2140 {
    public static void main(String[] args) {
        int[][] in = new int[4][2];

        in[0][0] = 3;
        in[0][1] = 2;
        in[1][0] = 4;
        in[1][1] = 3;
        in[2][0] = 4;
        in[2][1] = 4;
        in[3][0] = 2;
        in[3][1] = 5;

        long l;
        l = new SolvingQuestionsWithBrainpower2140().mostPoints(in);

    }

    public long mostPoints(int[][] questions) {
        long dp[] = new long[questions.length];
        for (int i = dp.length - 1; i >= 0; i--) {
            dp[i] = questions[i][0];
            if (i + questions[i][1] + 1 < dp.length) {
                dp[i] = dp[i + questions[i][1] + 1] + questions[i][0];
            }

            if (i != dp.length - 1) {
                dp[i] = Math.max(dp[i + 1], dp[i]);
            }
        }

        return dp[0];
    }
}
