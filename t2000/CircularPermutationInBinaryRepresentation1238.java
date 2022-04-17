package com.lemonade.leetcode.t2000;

import java.util.ArrayList;
import java.util.List;

public class CircularPermutationInBinaryRepresentation1238 {

    public static void main(String[] args) {
        System.out.println(circularPermutation(7, 2));
    }

    static int start;

    public static List<Integer> circularPermutation(int n, int sta) {
        start = sta;
        List<Integer> list = new ArrayList<>(1 << n);
        list.add(start);
        f(list, n);

        return list;
    }

    public static void f(List<Integer> list, int n) {
        if (n == 0) {
            return;
        }
        f(list, n - 1);
        start = start ^ 1 << n;
        list.add(start);
        f(list, n - 1);
    }

//
//    public static List<Integer> circularPermutation(int n, int start) {
//        int[] arr = new int[1 << n];
//
//        for (int i = 0; i < n; i++) {
//
//            int t = (1 << i) - 1;
//            while (t < 1 << n) {
//                arr[t] = i + 1;
//                t += 1 << (i + 1);
//            }
//        }
//        arr[(1 << n) - 1] = n;
//
//        List<Integer> list = new ArrayList<>(1 << n);
//        list.add(start);
//        for (int i = 0; i < arr.length; i++) {
//            start = start ^ 1 << (arr[i] - 1);
//            list.add(start);
//        }
//        return list;
//    }
}
