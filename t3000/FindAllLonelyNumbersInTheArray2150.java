package com.lemonade.leetcode.t3000;

import com.sun.source.tree.Tree;

import java.util.*;

public class FindAllLonelyNumbersInTheArray2150 {

    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[1000001];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (i == 0) {
                    if (arr[i + 1] == 0) {
                        list.add(0);
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i - 1] == 0) {
                        list.add(i);
                    }
                } else {
                    if (arr[i - 1] == 0 && arr[i + 1] == 0) {
                        list.add(i);
                    }
                }

            }
        }
        return list;
    }

    public List<Integer> findLonely2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> i :  map.entrySet()){
            if(1 == i.getValue() && !map.containsKey(i.getKey() - 1) && !map.containsKey(i.getKey() + 1)){
                list.add(i.getKey());
            }
        }
        return list;
    }
}
