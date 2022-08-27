package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class ReorderedPowerOf2_869 {
    public boolean reorderedPowerOf2(int n) {
        int base = 1;
        while (String.valueOf(n).length() >= String.valueOf(base).length()) {

            if (String.valueOf(n).length() == String.valueOf(base).length()) {
                if (check(base, n)) {
                    return true;
                }
            }
            base *= 2;
        }
        return false;
    }

    private boolean check(int base, int n) {
        String baseStr = String.valueOf(base);
        String nStr = String.valueOf(n);
        int[] arr = new int[10];
        for (int i = 0; i < baseStr.length(); i++) {
            arr[baseStr.charAt(i) - '0']++;
            arr[nStr.charAt(i) - '0']--;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
