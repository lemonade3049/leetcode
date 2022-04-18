package com.lemonade.leetcode.t1000.t500;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
