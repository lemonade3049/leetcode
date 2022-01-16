package com.lemonade.leetcode.t1000.t100;

public class Sqrt69 {
    public static void main(String[] args) {
        // 2147483647
        //2,147,483,647
        // System.out.println(Integer.MAX_VALUE);
        System.out.println(46340 * 46340);
    }

    public static int mySqrt(int x) {
        if (x == 1) {
            return x;
        }
        int low = 1;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low - 1;
    }
}
