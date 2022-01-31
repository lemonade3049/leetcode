package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class MaximumDepthOfBinaryTree104 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        return f(root);
    }

    int f(TreeNode n) {
        if (n == null) {
            return 0;
        } else {
            return Math.max(f(n.left), f(n.right)) + 1;
        }

    }
}
