package com.lemonade.leetcode.t1000.t200;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums){
            res ^= i;
        }
        return res;
    }
}
