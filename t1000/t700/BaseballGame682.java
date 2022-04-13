package com.lemonade.leetcode.t1000.t700;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {

    public static void main(String[] args) {
        int i = new BaseballGame682().calPoints(new String[]{"5", "2", "C", "D", "+"});
        System.out.println(i);
    }

    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>(1000);
        for (String op : ops) {
            int size = list.size();
            int curr;
            switch (op) {
                case "+":
                    curr = list.get(size - 1) + list.get(size - 2);
                    list.add(curr);
                    break;
                case "D":
                    curr = list.get(size - 1) * 2;
                    list.add(curr);
                    break;
                case "C":
                    Integer remove = list.remove(size - 1);
                    break;
                default:
                    curr = Integer.parseInt(op);
                    list.add(curr);
            }
        }

        int res = 0;
        for (Integer integer : list) {
            res += integer;
        }
        return res;
    }
}
