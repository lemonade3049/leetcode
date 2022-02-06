package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class PartitionArrayAccordingToGivenPivot2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int equal = 0;
        for (int num : nums) {
            if (num == pivot) {
                equal++;
            } else if (num < pivot) {
                less++;
            }
        }
        int[] res = new int[nums.length];
        equal = equal + less;
        int index = 0;
        for (int num : nums) {
            if (num == pivot) {
                res[less++] = num;
            } else if (num < pivot) {
                res[index++] = num;
            } else {
                res[equal++] = num;
            }
        }
        return res;
    }
}
