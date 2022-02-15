package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class ReachingPoints780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (true) {
            if (tx > ty) {
                tx = tx - ty;
            } else {
                ty = ty - tx;
            }

            if (tx == sx && ty == sy) {
                return true;
            } else if (tx < sx || ty < sy) {
                return false;
            }
        }
    }
}
