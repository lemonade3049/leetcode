package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[cur]){
                nums[++cur]=nums[i];
            }
        }
        return  cur + 1;
    }
}
