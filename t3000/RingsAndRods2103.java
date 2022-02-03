package com.lemonade.leetcode.t3000;

@SuppressWarnings("unused")
public class RingsAndRods2103 {
    public int countPoints(String rings) {
        byte[] arr = new byte[10];

        for (int i = 0; i < rings.length(); i += 2) {
            int index = rings.charAt(i + 1) - '0';
            switch (rings.charAt(i)) {
                case 'B' -> arr[index] |= 1;
                case 'G' -> arr[index] |= 2;
                case 'R' -> arr[index] |= 4;
            }
        }

        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 7) {
                res++;
            }
        }
        return res;
    }
}
