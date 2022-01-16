package com.lemonade.leetcode.t1000.t900;

public class MaximizeDistanceToClosestPerson849 {
    public static void main(String[] args) {
        new MaximizeDistanceToClosestPerson849().maxDistToClosest(new int[]{1, 0, 0, 0});
    }

    public int maxDistToClosest(int[] seats) {
        int max = -1;
        int temp = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (max == -1) {
                    max = i;
                } else {
                    max = Math.max(max, (i - temp) / 2);
                }
                temp = i;
            }
        }
        if (seats[seats.length - 1] == 0) {
            max = Math.max(max, seats.length - 1 - temp);
        }

        return max;
    }
}
