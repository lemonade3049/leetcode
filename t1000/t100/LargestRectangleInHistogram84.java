package com.lemonade.leetcode.t1000.t100;

public class LargestRectangleInHistogram84 {


    public static void main(String[] args) {
        int x = new LargestRectangleInHistogram84().largestRectangleArea(new int[]{2, 4});
        System.out.println(x);
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }
        
        int[] lArr = new int[n]; 
        int[] rArr = new int[n];
        rArr[n - 1] = n;
        lArr[0] = -1;

        for (int i = 1; i < n; i++) {
            int p = i - 1;

            while (p >= 0 && heights[p] >= heights[i]) {
                p = lArr[p];
            }
            lArr[i] = p;
        }

        for (int i = n - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < n && heights[p] >= heights[i]) {
                p = rArr[p];
            }
            rArr[i] = p;
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (rArr[i] - lArr[i] - 1));
        }

        return maxArea;
    }
}
