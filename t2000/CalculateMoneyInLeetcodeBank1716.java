package com.lemonade.leetcode.t2000;

@SuppressWarnings("unused")
public class CalculateMoneyInLeetcodeBank1716 {

    public int totalMoney(int n) {

        int x = n / 7;
        int y = n % 7;
        return 28 * x + (x - 1) * x / 2 * 7 + (2 * x + 1 + y) * y / 2;

    }
}
