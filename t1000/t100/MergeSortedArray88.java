package com.lemonade.leetcode.t1000.t100;
@SuppressWarnings("unused")
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p2 = nums2.length - 1;
        int p1 = nums1.length - 1;
        m--;
        while(p2 >= 0 && m >= 0){
            if(nums2[p2] > nums1[m]){
                nums1[p1--] = nums2[p2--];
            }else{
                nums1[p1--] = nums1[m--];
            }
        }
        while (p2 >= 0){
            nums1[p1--] = nums2[p2--];
        }
    }
}
