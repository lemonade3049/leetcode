package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class ANumberAfterADoubleReversal2119 {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        return num % 10 != 0;
    }
}
