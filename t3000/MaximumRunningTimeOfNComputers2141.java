package com.lemonade.leetcode.t3000;

import java.util.ArrayList;
import java.util.List;

public class MaximumRunningTimeOfNComputers2141 {
    public static void main(String[] args) {
        System.out.println(new MaximumRunningTimeOfNComputers2141().maxRunTime(9, new int[]{18, 54, 2, 53, 87, 31, 71, 4, 29, 25}));
    }

    public long maxRunTime(int n, int[] batteries) {

        List<Integer> list = new ArrayList<>();
        for (int battery : batteries) {
            list.add(battery);
        }
        return f(n, list);
    }

    long f(int n, List<Integer> batteries) {
        long sum = 0;

        for (Integer battery : batteries) {
            sum += battery;
        }
        while (true) {
            long even = sum / n;
            boolean deleteFlg = false;
            sum = 0;
            for (int i = 0; i < batteries.size(); i++) {
                if (batteries.get(i) > even) {
                    n--;
                    deleteFlg = true;
                    batteries.remove(i);
                    i--;
                } else {
                    sum += batteries.get(i);
                }
            }

            if (!deleteFlg) {
                break;
            }
        }


        return sum / n;
    }
}
