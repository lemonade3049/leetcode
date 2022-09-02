package com.lemonade.leetcode.t2000.t1500;

import java.util.Arrays;

@SuppressWarnings("unused")
public class TheKStrongestValuesInAnArray1471 {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, (o1, o2) -> Math.abs(o2 - median) == Math.abs(o1 - median) ? o2 - o1 : Math.abs(o2 - median) - Math.abs(o1 - median));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr2[i];
        }
        return res;
    }
}
