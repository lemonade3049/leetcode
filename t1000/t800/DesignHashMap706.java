package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class DesignHashMap706 {
    static class MyHashMap {
        int[] arr = new int[(int) (10e5 + 1)];

        public MyHashMap() {
            // Arrays.fill(arr, -1);
        }

        public void put(int key, int value) {
            arr[key] = value + 1;
        }

        public int get(int key) {
            return arr[key] - 1;
        }

        public void remove(int key) {
            arr[key] = 0;
        }
    }
}
