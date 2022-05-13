package com.lemonade.leetcode.t1000.t300;

@SuppressWarnings("unused")
public class CountPrimes204 {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] arr = new boolean[n];
        int ans = 1;
        int i = 3;
        for (; i * i < n; i += 2) {
            if (!arr[i]) {
                for (int j = i * i; j < n; j += i) {
                    arr[j] = true;
                }
                ans++;
            }
        }
        for (; i < n; i += 2) {
            if (!arr[i]) {
                ans++;
            }
        }
        return ans;
    }
}
