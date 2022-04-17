package com.lemonade.leetcode.todo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Finding3DigitEvenNumbers2094 {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr = new int[10];
        for (int i = 0; i < digits.length; i++) {
            arr[digits[i]]++;
        }
        List<Integer> list = new ArrayList<>();


        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
