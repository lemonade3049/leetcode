package com.lemonade.leetcode.t1000.t400;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class TopKFrequentElements347 {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> p = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            p.offer(item);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[k - i - 1] = Objects.requireNonNull(p.poll()).getKey();
        }
        return res;
    }
}
