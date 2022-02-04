package com.lemonade.leetcode.t3000;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class FindTargetIndicesAfterSortingArray2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int equal = 0;
        for (int num : nums) {
            if (num == target) {
                equal++;
            } else if (num < target) {
                less++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < equal; i++) {
            list.add(i + less);
        }
        return list;
    }
}
