package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class ReverseBits190 {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res <<= 1;
            res += n & 1;
            n >>>= 1;

        }

        return res;
    }
}
