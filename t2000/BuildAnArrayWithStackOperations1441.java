package com.lemonade.leetcode.t2000;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class BuildAnArrayWithStackOperations1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int i = 1;
        int index = 0;
        while (index < target.length) {

            list.add("Push");
            if (target[index] == i++) {
                index++;
            } else {
                list.add("Pop");
            }
        }

        return list;
    }
}
