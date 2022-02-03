package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int[] arr = new int[prices.length];
        arr[arr.length - 1] = 0;
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i] = Math.max(arr[i + 1], prices[i + 1]);
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i] - prices[i]);
        }
        return max;
    }
}
