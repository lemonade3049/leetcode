package com.lemonade.leetcode.t2000;

public class SumOfRootToLeafBinaryNumbers1022 {
    public class TreeNode {
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

    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        f(root, 0);
        return sum;
    }

    void f(TreeNode t, int pre) {
        if (t.left == null && t.right == null) {
            sum += (pre + t.val);
            return;
        }

        if (t.left != null) {
            f(t.left, (pre + t.val) << 1);
        }

        if (t.right != null) {
            f(t.right, (pre + t.val) << 1);
        }
    }
}
