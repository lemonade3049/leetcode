package com.lemonade.leetcode.t2000;

import java.util.PriorityQueue;

public class DistantBarcodes1054 {

    public static void main(String[] args) {
        new DistantBarcodes1054().rearrangeBarcodes(new int[]{1});
    }

    class P implements Comparable<P> {
        int key;
        int value;

        public P(int k, int v) {
            key = k;
            value = v;
        }


        @Override
        public int compareTo(P o) {
            return o.value - this.value;
        }
    }

    public int[] rearrangeBarcodes(int[] barcodes) {

        PriorityQueue<P> p = new PriorityQueue();

        int a[] = new int[10001];
        for (int i = 0; i < barcodes.length; i++) {
            a[barcodes[i]]++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                p.add(new P(i, a[i]));
            }
        }

        int[] res = new int[barcodes.length];
        int index = 0;
        while (!p.isEmpty()) {
            P t = p.poll();
            while (t.value > 0) {
                res[index] = t.key;
                t.value--;
                index += 2;
                if (index >= barcodes.length) {
                    index = 1;
                }
            }
        }

        return res;
    }

}