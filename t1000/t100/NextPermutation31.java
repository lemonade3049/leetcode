package com.lemonade.leetcode.t1000.t100;

public class NextPermutation31 {
    public static void main(String[] args) {
        new NextPermutation31().nextPermutation(new int[]{1,2,3});
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while(i > 0 && nums[i] < nums[i - 1]){
            i--;
        }

        if(i == 0){
            reverse(nums, 0);
            return;
        }
        i--;
        for(int j = nums.length - 1; ;j--){
            if(nums[j] > nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        reverse(nums, i + 1);

    }

    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;

        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
