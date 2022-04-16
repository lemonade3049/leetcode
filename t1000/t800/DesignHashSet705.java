package com.lemonade.leetcode.t1000.t800;

@SuppressWarnings("unused")
public class DesignHashSet705 {

    static class MyHashSet {
        boolean[] arr = new boolean[(int) (10e5 + 1)];

        public MyHashSet() {

        }

        public void add(int key) {
            arr[key] = true;
        }

        public void remove(int key) {
            arr[key] = false;
        }

        public boolean contains(int key) {
            return arr[key];
        }
    }
}
