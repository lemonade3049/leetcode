package com.lemonade.leetcode.t1000.t200;

public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0;
        int pre = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            t += gas[i];
            t -= cost[i];
            pre += gas[i];
            pre -= cost[i];

            if (pre < 0) {
                pre = 0;
                index = i + 1;
            }
        }

        return (t >= 0) ? index : -1;
    }
}
