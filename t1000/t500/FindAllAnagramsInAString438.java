package com.lemonade.leetcode.t1000.t500;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class FindAllAnagramsInAString438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()){
            return list;
        }

        char[] pArr = p.toCharArray();
        char[] sArr = s.toCharArray();

        for(int i = 0; i < pArr.length; i++){
            arr[pArr[i] - 'a']--;
            arr[sArr[i] - 'a']++;
        }


        if(check(arr)){
            list.add(0);
        }

        for(int i = pArr.length; i < sArr.length; i++){
            arr[sArr[i] - 'a']++;
            arr[sArr[i - pArr.length] - 'a']--;
            if(check(arr)){
                list.add(i - pArr.length + 1);
            }
        }
        return list;
    }

    boolean check(int[] arr){
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
