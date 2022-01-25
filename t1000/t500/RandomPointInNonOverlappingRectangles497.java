package com.lemonade.leetcode.t1000.t500;


import java.util.Random;

public class RandomPointInNonOverlappingRectangles497 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{-2, -2, 1, 1};
        arr[1] = new int[]{2, 2, 4, 6};

        Solution ins = new RandomPointInNonOverlappingRectangles497().new Solution(arr);

        for (int i = 0; i < 100; i++) {
            ins.pick();
        }

    }

    class Solution {

        class Point {
            int x1;
            int x2;
            int y1;
            int y2;
            int size;
        }

        Point[] p = null;
        int sum = 0;
        Random rad = new Random();

        public Solution(int[][] rects) {

            p = new Point[rects.length];
            for (int i = 0; i < rects.length; i++) {
                Point p1 = new Point();
                p1.x1 = rects[i][0];
                p1.x2 = rects[i][2];
                p1.y1 = rects[i][1];
                p1.y2 = rects[i][3];
                p1.size = (p1.x2 - p1.x1 + 1) * (p1.y2 - p1.y1 + 1);
                p[i] = p1;
                sum += p1.size;
            }
        }

        public int[] pick() {

            int x = rad.nextInt(sum);

            for (int i = 0; i < p.length; i++) {
                if (x >= p[i].size) {
                    x -= p[i].size;
                } else {
                    int width = p[i].x2 - p[i].x1 + 1;
                    return new int[]{p[i].x1 + x % width, p[i].y1 + x / width};
                }
            }
            return null;
        }
    }
}
