package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class Permutations46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        f(nums, 0, ans);
        return ans;
    }

    private void f(int[] nums, int start, List<List<Integer>> ans) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>(nums.length);
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            f(nums, start + 1, ans);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
