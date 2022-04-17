package com.lemonade.leetcode.t3000;


import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class RootEqualsSumOfChildren2236 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
