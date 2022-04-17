package com.lemonade.leetcode.todo;


import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class TrimABinarySearchTree669 {

    public TreeNode trimBST(TreeNode root, int low, int high) {

        while (root != null && (root.val < low || root.val > high)){
            if(root.val < low){
                root = root.right;
            }else {
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
