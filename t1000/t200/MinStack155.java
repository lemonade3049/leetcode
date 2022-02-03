package com.lemonade.leetcode.t1000.t200;

import java.util.PriorityQueue;
import java.util.Stack;

@SuppressWarnings("unused")
public class MinStack155 {
    public static void main(String[] args) {

    }

    static class O implements Comparable<O> {
        int val;

        O(int v) {
            val = v;
        }

        @Override
        public int compareTo(O o) {
            return this.val > o.val ? 1 : -1;
        }
    }

    static class MinStack {

        PriorityQueue<O> p = new PriorityQueue<>();
        Stack<O> s = new Stack<>();

        public MinStack() {

        }

        public void push(int val) {
            O o = new O(val);
            p.offer(o);
            s.push(o);
        }

        public void pop() {
            O o = s.pop();
            p.remove(o);
        }

        public int top() {
            return s.peek().val;
        }

        public int getMin() {
            return p.isEmpty() ? 0 : p.peek().val;
        }
    }
}
