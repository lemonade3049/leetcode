package com.lemonade.leetcode.t1000.t700;

public class ConstructStringFromBinaryTree606 {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        if(root.left == null && root.right == null){
            return sb.toString();
        }
        f(root.left, true, sb);
        f(root.right, false, sb);
        return sb.toString();
    }

    void f(TreeNode n, boolean flg, StringBuilder sb) {
        if (n == null) {
            if (flg) {
                sb.append("()");
            }
            return;
        }
        sb.append("(" + n.val);
        if (n.left == null && n.right == null) {
            sb.append(")");
            return;
        }
        f(n.left, true, sb);
        f(n.right, false, sb);
        sb.append(")");
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
