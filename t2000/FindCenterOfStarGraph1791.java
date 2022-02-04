package com.lemonade.leetcode.t2000;

@SuppressWarnings("unused")
public class FindCenterOfStarGraph1791 {
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) {
            return edges[0][1];
        }
        return 0;
    }
}
