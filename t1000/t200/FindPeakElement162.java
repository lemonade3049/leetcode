package com.lemonade.leetcode.t1000.t200;

public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {

        int l = 0;
        int r = nums.length;

        while(l < r){
            if(r == l + 1){
                if(nums[l] > nums[r]){
                    return l;
                }else{
                    return r;
                }
            }
            if(nums[l]  > nums[r]){
                r = l + (r - l) / 2;
            }else{
                l = l + (r - l) / 2;
            }
        }

        return l;
    }
}
