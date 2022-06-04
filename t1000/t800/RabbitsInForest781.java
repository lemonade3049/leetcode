package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class RabbitsInForest781 {
    public int numRabbits(int[] answers) {
        int[] arr = new int[1001];
        for (int answer : answers) {
            arr[answer]++;
        }
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            res += ((arr[i] - 1) / (i + 1) + 1) * (i + 1);
        }
        return res;
    }
}
