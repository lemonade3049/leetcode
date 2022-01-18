package com.lemonade.leetcode.t1000.t700;

public class CanPlaceFlowers605 {

    public static void main(String[] args) {
        new CanPlaceFlowers605().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        int t = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                t++;
            } else {
                total += t / 2;
                t = 0;
            }
        }

        total += t / 2;
        return total >= n;
    }
}
