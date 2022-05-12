package com.lemonade.leetcode.t1000.t100;

import java.util.*;

@SuppressWarnings("unused")
public class PermutationsII47 {

    public  void main(String[] args) {
        System.out.println(new PermutationsII47().permuteUnique(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        f(nums, 0, ans);
        return ans;
    }

    private void f(int[] nums, int start, List<List<Integer>> ans) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
        }

        boolean[] visited = new boolean[21];
        for (int i = start; i < nums.length; i++) {
            if(visited[nums[i] + 10]){
                continue;
            }
            visited[nums[i] + 10] = true;
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
