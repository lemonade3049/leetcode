package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class SymmetricTree101 {
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

    public boolean isSymmetric(TreeNode root) {
        return f(root.left, root.right);
    }

    private boolean f(TreeNode l, TreeNode r) {
        if (l != null && r != null) {
            return l.val == r.val && f(l.left, r.right) && f(l.right, r.left);
        } else return l == null && r == null;
    }
}
