package com.lemonade.leetcode.t2000.t1100;

public class ValidBoomerang1037 {
    public boolean isBoomerang(int[][] points) {
        if ((points[0][0] == points[1][0] && points[0][1] == points[1][1]) ||
                (points[2][0] == points[1][0] && points[2][1] == points[1][1]) ||
                (points[0][0] == points[2][0] && points[0][1] == points[2][1])) {
            return false;
        }
        if ((points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) ==
                (points[0][0] - points[2][0]) * (points[0][1] - points[1][1])) {
            return false;
        }

        return true;
    }
}
