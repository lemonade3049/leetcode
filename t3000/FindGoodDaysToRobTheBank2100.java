package com.lemonade.leetcode.t3000;

import java.util.LinkedList;
import java.util.List;

public class FindGoodDaysToRobTheBank2100 {

    public static void main(String[] args) {
        System.out.println(new FindGoodDaysToRobTheBank2100().goodDaysToRobBank(new int[]{5, 3, 3, 3, 5, 6, 2}, 2));
    }
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new LinkedList<>();
        int[] ac = new int[security.length];
        ac[0] = 0;
        for (int i = 1; i < security.length; i++) {
            if (security[i] <= security[i - 1]) {
                ac[i] = ac[i - 1] + 1;
            }else{
                ac[i] = 0;
            }
        }
        int[] de = new int[security.length];
        de[security.length - 1] = 0;
        for (int i = security.length - 2; i >=0; i--) {
            if (security[i] <= security[i + 1]) {
                de[i] = de[i + 1] + 1;
            }else{
                de[i] = 0;
            }
        }
        for(int i = time; i < security.length - time; i++){
            if(ac[i] >= time && de[i] >= time){
                list.add(i);
            }
        }
        return list;
    }
}
