package com.lemonade.leetcode.t2000;

import java.util.*;

@SuppressWarnings("unused")
public class LuckyNumbersInAMatrix1380 {

    public List<Integer> luckyNumbers(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        for (int[] ints : matrix) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, ints[j]);
            }
            set.add(min);
        }
        List<Integer> rList = new LinkedList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                max = Math.max(max, ints[i]);
            }
            if(set.contains(max)){
                rList.add(max);
            }
        }
        return rList;
    }
}
