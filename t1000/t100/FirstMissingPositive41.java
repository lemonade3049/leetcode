package com.lemonade.leetcode.t1000.t100;

@SuppressWarnings("unused")
public class FirstMissingPositive41 {

    public static void main(String[] args) {
        System.out.println(new FirstMissingPositive41().firstMissingPositive(new int[]{1, 1}));
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int t= nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public int firstMissingPositive1(int[] nums) {
        int maxLength = Math.min((int) (5e5 + 1), nums.length + 1);
        boolean[] arr = new boolean[maxLength];
        for (int curr : nums) {
            if (curr > 0 && curr < maxLength) {
                arr[curr] = true;
            }
        }
        for (int i = 1; i < maxLength; i++) {
            if (!arr[i]) {
                return i;
            }
        }
        return maxLength;
    }
}
