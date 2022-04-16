package com.lemonade.leetcode.t1000.t1000;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings({"unused"})
public class NumberOfRecentCalls933 {

    static class RecentCounter {

        Queue<Integer> q;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.offer(t);
            while ((q.peek() == null ? 0 : q.peek()) < t - 3000) {
                q.poll();
            }
            return q.size();
        }
    }
}
