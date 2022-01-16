package com.lemonade.leetcode.t1000.t1000;

public class KnightDialer935 {
    public static void main(String[] args) {
        new KnightDialer935().knightDialer(3131);
    }

    public int knightDialer(int n) {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 1;
        }
        /* 0 4,6
         * 1 6,8
         * 2 7,9
         * 3 4,8
         * 4 0,3,9
         * 6 0,1,7
         * 7 2,6
         * 8 1,3
         * 9 2,4
         * */
        for (int i = 1; i < n; i++) {
            b[0] = a[4] + a[6];
            b[1] = a[6] + a[8];
            b[2] = a[7] + a[9];
            b[3] = a[4] + a[8];
            b[4] = a[0] + a[3];
            if (b[4] >= 1000000007) {
                b[4] = b[4] - 1000000007;
            }
            b[4] = b[4] + a[9];
            b[6] = a[0] + a[1];
            if (b[6] >= 1000000007) {
                b[4] = b[4] - 1000000007;
            }
            b[4] = b[4] + a[7];
            b[7] = a[2] + a[6];
            b[8] = a[1] + a[3];
            b[9] = a[2] + a[4];
            a = b;
            b = new int[10];
            for (int j = 0; j < 10; j++) {
                if (a[j] >= 1000000007) {
                    a[j] -= 1000000007;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
            if (sum >= 1000000007) {
                sum -= 1000000007;
            }
        }
        return sum;
    }
}
