package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Subsets78 {

    public List<List<Integer>> subsets(int[] nums) {
        int size = (int) Math.pow(2, nums.length);
        List<List<Integer>> res = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            List<Integer> list = new ArrayList<>();
            res.add(list);
        }
        int diff = 1;
        for (int num : nums) {
            for (int j = 0; j < size; j++) {
                if (j % (diff * 2) / diff < 1) {
                    res.get(j).add(num);
                }
            }
            diff *= 2;
        }

        return res;
    }

}
