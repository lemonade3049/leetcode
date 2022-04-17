package com.lemonade.leetcode.t3000;

public class MinimumMovesToReachTargetScore2139 {
    public static void main(String[] args) {
        System.out.println(new MinimumMovesToReachTargetScore2139().minMoves(19, 2));
    }

    public int minMoves(int target, int maxDoubles) {

        int t = target;
        int doubleTimes = 0;

        while (t / 2 >= 2 && doubleTimes < maxDoubles) {
            t = t / 2;
            target -= t;
            doubleTimes++;

        }

        return doubleTimes + target - 1;
    }

}
