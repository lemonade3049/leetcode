package com.lemonade.leetcode.t3000;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Finding3DigitEvenNumbers2094 {

    public int[] findEvenNumbers(int[] digits) {
        int[] digitsFrequency = new int[10];

        List<Integer> list = new ArrayList<>();
        for (int digit : digits) {
            digitsFrequency[digit]++;
        }

        outer:
        for (int i = 100; i < 999; i += 2) {
            int[] tempFrequency = new int[10];
            tempFrequency[i % 10]++;
            tempFrequency[i / 10 % 10]++;
            tempFrequency[i / 100]++;

            for (int j = 0; j < 10; j++) {
                if(tempFrequency[j] > digitsFrequency[j]){
                    continue outer;
                }
            }
            list.add(i);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
