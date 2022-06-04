package com.lemonade.leetcode.t1000.t400;

@SuppressWarnings("unused")
public class CoinChange322 {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] arr = new int[amount + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            for (int coin : coins) {
                if (coin <= amount && i + coin < arr.length) {
                    if (arr[i + coin] == -1) {
                        arr[i + coin] = arr[i] + 1;
                    } else {
                        arr[i + coin] = Math.min(arr[i + coin], arr[i] + 1);
                    }
                }
            }
        }
        return arr[arr.length - 1];
    }


}
