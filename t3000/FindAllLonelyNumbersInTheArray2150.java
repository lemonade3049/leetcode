package com.lemonade.leetcode.t3000;

import java.util.*;

@SuppressWarnings("unused")
public class FindAllLonelyNumbersInTheArray2150 {

    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[1000001];

        for (int num : nums) {
            arr[num]++;
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
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
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
