package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class RemoveDuplicatesFromSortedArrayII80 {


    public int removeDuplicates(int[] nums) {
        int curr = (int) -1e5;
        int qty = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curr == nums[i]) {
                qty++;
            } else {
                qty = 1;
                curr = nums[i];
            }
            if (qty <= 2) {
                if (index != i) {
                    swap(nums, index, i);
                }
                index++;
            }
        }
        return index - 1;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
