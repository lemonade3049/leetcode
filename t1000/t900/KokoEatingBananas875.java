package com.lemonade.leetcode.t1000.t900;

import java.util.PriorityQueue;

public class KokoEatingBananas875 {
    /*
    [312884470]
968709470
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        new KokoEatingBananas875().minEatingSpeed(new int[]{312884470}, 968709470);
        System.out.println(System.currentTimeMillis());
    }

    static class DecoratedPile implements Comparable<DecoratedPile> {
        int total;
        int eatTimes;
        int oneTimeQty;

        DecoratedPile(int pile) {
            total = pile;
            eatTimes = 1;
            oneTimeQty = pile;
        }

        void plus() {
            eatTimes++;

            oneTimeQty = (total - 1) / eatTimes + 1;
        }


        @Override
        public int compareTo(DecoratedPile o) {
            return o.oneTimeQty - this.oneTimeQty;
        }
    }

    public int minEatingSpeed1(int[] piles, int h) {
        PriorityQueue<DecoratedPile> p = new PriorityQueue<>();
        for (int i = 0; i < piles.length; i++) {
            p.offer(new DecoratedPile(piles[i]));
        }

        for (int i = 0; i < h - piles.length; i++) {
            DecoratedPile d = p.poll();
            d.plus();
            p.offer(d);
        }

        return p.peek().oneTimeQty;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        long sum = 0;
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];
            max = Math.max(max, piles[i]);
        }

        speed = Math.max((int) ((sum - 1) / h), 1);
        int i = speed - 1;
        int j = max;
        while (speed < j && speed > i) {
            int res = getH(piles, speed);
            if (res > h) {
                i = speed;
                speed = (j - speed + 1) / 2 + speed;
            } else {
                j = speed;
                speed = (speed - i + 1) / 2 + i;
            }
        }
        if(speed == j){
            return speed;
        }else{
            return i + 1;
        }
    }
    int getH(int[] piles, int speed) {

        int res = 0;
        for (int i = 0; i < piles.length; i++) {
            res += (piles[i] - 1) / speed + 1;
        }
        return res;
    }

}
