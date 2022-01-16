package com.lemonade.leetcode.t1000.t700;

public class SearchInABinarySearchTree700 {
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

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        TreeNode t = root;
        while(t != null && t.val != val){
            if(t.val > val){
                t = t.left;
            }else {
                t = t.right;
            }
        }

        return t;
    }
}
