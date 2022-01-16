package com.lemonade.leetcode.t1000.t400;

import java.util.*;

public class RandomPickIndex398 {


    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1, 2, 3, 3, 3});
Random r = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt());
        }
    }

    static  class Solution {
        class InnerArr {
            int index = 0;
            int[] arr;
            InnerArr(int n){
                arr = new int[n];
            }
        }
        HashMap<Integer, InnerArr> map = new HashMap<>();

        public Solution(int[] nums) {

            HashMap<Integer, Integer> tMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer num = tMap.get(nums[i]);
                 if(num == null){
                     tMap.put(nums[i], 1) ;
                 }else{
                     tMap.put(nums[i], ++num);
                 }
            }

            for(Map.Entry<Integer, Integer> item : tMap.entrySet()){
                map.put(item.getKey(), new InnerArr(item.getValue()));
            }
            for (int i = 0; i < nums.length; i++) {
                 InnerArr t=  map.get(nums[i]);
                 t.arr[t.index++] = i;
            }
        }

        public int pick(int target) {
            InnerArr t = map.get(target);
            return t.arr[getRandom(t.index)];
        }

        private int getRandom(int n) {
            return (int) (Math.random() * n);
        }
    }
}
