package com.lemonade.leetcode.t1000.t800;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (f(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean f(int i) {
        int t = i;
        while (t > 0) {
            int m = t % 10;
            if (m == 0) {
                return false;
            }
            if (i % m != 0) {
                return false;
            }
            t /= 10;
        }
        return true;
    }
}
