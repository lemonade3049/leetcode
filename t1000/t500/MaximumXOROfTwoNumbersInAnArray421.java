package com.lemonade.leetcode.t1000.t500;

public class MaximumXOROfTwoNumbersInAnArray421 {
    static class Node {
        Node left;
        Node right;

        Node(Node l, Node r) {
            left = l;
            right = r;
        }

        Node() {

        }
    }

    public int findMaximumXOR(int[] nums) {
        Node root = new Node();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int deep = 0;

        while (max > 0) {
            max >>= 1;
            deep++;
        }

        for (int i = 0; i < nums.length; i++) {
            int m = 1 << deep;
            for (int j = 0; j <= deep; j++) {
                if ((nums[i] & m) == 1) {

                }
            }
        }
        return 0;
    }
}
