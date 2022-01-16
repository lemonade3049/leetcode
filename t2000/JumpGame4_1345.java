package com.lemonade.leetcode.t2000;

import java.util.*;

public class JumpGame4_1345 {

    public static void main(String[] args) {
        System.out.println(new JumpGame4_1345().minJumps(new int[]{51, 64, -15, 58, 98, 31, 48, 72, 78, -63, 92, -5, 64, -64, 51, -48, 64, 48, -76, -86, -5, -64, -86, -47, 92, -41, 58, 72, 31, 78, -15, -76, 72, -5, -97, 98, 78, -97, -41, -47, -86, -97, 78, -97, 58, -41, 72, -41, 72, -25, -76, 51, -86, -65, 78, -63, 72, -15, 48, -15, -63, -65, 31, -41, 95, 51, -47, 51, -41, -76, 58, -81, -41, 88, 58, -81, 88, 88, -47, -48, 72, -25, -86, -41, -86, -64, -15, -63}));
    }

    public int minJumps(int[] arr) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.get(arr[i]) == null) {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(arr[i], list);
            } else {
                map.get(arr[i]).add(i);
            }
        }
        int[] dp = new int[arr.length];
        for (int i = 0; i < dp.length - 1; i++) {
            dp[i] = -1;
        }
        q.offer(arr.length - 1);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == 0) {
                return dp[curr];
            }
            List<Integer> list = map.get(arr[curr]);
            int i = dp[curr] + 1;
            if (list != null) {
                for (Integer t : list) {
                    if (t == 0) {
                        return dp[0] == -1 ? i : dp[0];
                    }
                    if (t != curr && (dp[t] == -1 || dp[t] > i)) {
                        dp[t] = i;
                        q.offer(t);
                    }
                }
                map.remove(arr[curr]);
            }
            if (curr > 0) {
                if (dp[curr - 1] == -1 || dp[curr - 1] > i) {
                    dp[curr - 1] = i;
                    q.offer(curr - 1);
                }
            }
            if (curr < arr.length - 1) {
                if (dp[curr + 1] == -1 || dp[curr + 1] > i) {
                    dp[curr + 1] = i;
                    q.offer(curr + 1);
                }
            }
        }
        return dp[0];
    }
}
