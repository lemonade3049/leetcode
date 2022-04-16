package com.lemonade.leetcode.t1000.t700;

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

public class TrimABinarySearchTree669 {

    public TreeNode trimBST(TreeNode root, int low, int high) {

        while (root != null && (root.val < low || root.val > high)){
            if(root.val < low){
                root = root.right;
            }else if(root.val > high){
                root = root.left;
            }
        }
        l(root, low);
        r(root, high);

        return root;
    }

    private void r(TreeNode root, int high) {
        while(root != null){
            if(root.right != null && root.right.val < high){
                root.right = root.right.left;
                l(root.right, high);
            }
        }
    }

    private void l(TreeNode root, int low) {
        while(root != null){
            if(root.left != null && root.left.val < low){
                root.left = root.left.right;
                l(root.left, low);
            }
        }
    }
}
