package com.lemonade.leetcode.t2000.t1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference1200 {

    public static void main(String[] args) {
        int [] arr = new int[]{2,4,1};
        new MinimumAbsoluteDifference1200().minimumAbsDifference(arr);


    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            min = Math.min(arr[i + 1] - arr[i], min);
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == min){
                List<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i + 1]);
                res.add(l);
            }
        }
        return res;
    }
}
