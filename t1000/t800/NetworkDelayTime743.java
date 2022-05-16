package com.lemonade.leetcode.t1000.t800;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unused")
public class NetworkDelayTime743 {

    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = -1;
            }
        }
        for (int[] time : times) {
            map[time[0] - 1][time[1] - 1] = time[2];
        }
        int[] res = new int[n];
        boolean[] couldReach = new boolean[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();

        k = k - 1;
        res[k] = 0;
        couldReach[k] = true;
        for (int i = 0; i < n; i++) {
            if (map[k][i] != -1) {
                res[i] = map[k][i];
                q.add(i);
                couldReach[i] = true;
            }
        }
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < n; i++) {
                if (map[poll][i] != -1) {
                    if (map[poll][i] + res[poll] < res[i]) {
                        res[i] = map[poll][i] + res[poll];
                        q.offer(i);
                    }
                    couldReach[i] = true;
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(!couldReach[i]){
                return -1;
            }
            ans = Integer.max(ans, res[i]);
        }
        return ans;
    }
}