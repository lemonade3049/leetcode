package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List[] arr = new ArrayList[target + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList();
            
        }

        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                List<Integer> temp = new ArrayList<>();
                if(j % candidates[i] ==0){
                    for (int k = 0; k < j / candidates[i]; k++) {

                    }
                }
            }
        }

        return null;
    }
}
