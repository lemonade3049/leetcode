package com.lemonade.leetcode.t1000.t800;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class KthLargestElementInAStream703 {

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(10,new int[]{1});
        for (int i = 0; i < 100; i++) {
            kthLargest.add(i);
        }
    }

    static class KthLargest {

        int k;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int i : nums) {
                add(i);
            }
        }

        public int add(int val) {
            pQ.offer(val);
            if (pQ.size() > k) {
                pQ.poll();
            }
            return pQ.peek();
        }
    }
}
