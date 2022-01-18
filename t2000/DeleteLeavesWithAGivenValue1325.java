package com.lemonade.leetcode.t2000;

public class DeleteLeavesWithAGivenValue1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (f(root, target)) {
            root = null;
        }
        return root;
    }

    boolean f(TreeNode n, int target) {


        if (n.left != null && f(n.left, target)) {
            n.left = null;
        }

        if (n.right != null && f(n.right, target)) {
            n.right = null;
        }

        if (n.left == null && n.right == null && n.val == target) {
            return true;
        }
        return false;
    }

    class TreeNode {
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
}
