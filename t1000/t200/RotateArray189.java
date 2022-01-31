package com.lemonade.leetcode.t1000.t200;

public class RotateArray189 {
    public static void main(String[] args) {
        new RotateArray189().rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        if (k == 0) {
            return;
        }
        int t = nums.length % k;
        if (t == 0) {
            t = k;
        }
        int x = 0;
        int i = 0;

        while (x != nums.length) {
            x++;
            int j = i + k;
            while (j != i) {
                swap(nums, i, j);
                j = (j + k) % nums.length;
                x++;
            }
            i++;
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
