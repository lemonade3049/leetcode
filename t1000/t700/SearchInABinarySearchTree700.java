package com.lemonade.leetcode.t1000.t700;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class SearchInABinarySearchTree700 {

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
