package com.lemonade.leetcode.t1000.t100;

import java.util.ArrayList;
import java.util.List;

/**
 * not finished
 */
@SuppressWarnings("unused")
public class CombinationSum39 {

    public static void main(String[] args) {
        new CombinationSum39().combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
//        f(candidates, 0, target, list);
        return list;
    }

    private List<List<Integer>> f(int[] candidates, int i, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int j = 0; j < target / candidates[i]; j++) {
            List<List<Integer>> list = f(candidates, i + 1, target - candidates[i] * j);
            for (int l = 0; l < list.size(); l++) {
                List<Integer> item = new ArrayList<>(list.get(l));
                for (int k = 0; k < j; k++) {
                    item.add(candidates[i]);
                }
                ret.add(item);
            }
        }
        return ret;
    }
}
