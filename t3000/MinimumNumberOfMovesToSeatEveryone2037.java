package com.lemonade.leetcode.t3000;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }
}
