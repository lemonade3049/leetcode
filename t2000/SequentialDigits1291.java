package com.lemonade.leetcode.t2000;

import javax.management.StringValueExp;
import java.lang.reflect.GenericArrayType;
import java.util.LinkedList;
import java.util.List;

public class SequentialDigits1291 {
    public static void main(String[] args) {
        new SequentialDigits1291().generate(5);
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new LinkedList<>();
        int n = String.valueOf(low).length();
        int m = String.valueOf(high).length();
        for(int i = n; i <= m; i++){
            List<Integer> tempList = generate(i);
            for (int j = 0; j < tempList.size(); j++) {
                Integer t = tempList.get(j);
                if(t >= low && t <= high){
                    list.add(t);
                }
            }
        }
        return list;
    }

    List<Integer> generate(int n){
        List<Integer> list = new LinkedList<>();
        int start = 0;
        int diff = 0;
        for(int i = 0; i < n; i++){
            start = start * 10 + i + 1;
            diff = diff * 10 + 1;
        }
        for(int i = 0; i < 10 - n; i++){
            list.add(start);
            start += diff;
        }
        return list;
    }
}
