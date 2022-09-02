package com.lemonade.leetcode.t2000.t1800;

@SuppressWarnings("unused")
public class NumberOfRectanglesThatCanFormTheLargestSquare1725 {

    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int maxNum = 0;
        for (int[] rectangle : rectangles) {
            int thisMin = Math.min(rectangle[0], rectangle[1]);
            if (max == thisMin) {
                maxNum++;
            } else if (max < thisMin) {
                max = thisMin;
                maxNum = 1;
            }
        }
        return maxNum;
    }
}
