package com.lemonade.leetcode.t3000;

public class RearrangeArrayElementsBySign2149 {

    public int[] rearrangeArray(int[] nums) {
        int[] newNums = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;
        for(int index = 0; index < nums.length;index++){
            if(nums[index] > 0){
                newNums[posIndex] = nums[index];
                posIndex += 2;
            }else{
                newNums[negIndex] = nums[index];
                negIndex += 2;
            }
        }

        return newNums;
    }
}
