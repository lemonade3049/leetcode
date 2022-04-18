package com.lemonade.leetcode.t1000.t300;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class KthSmallestElementInABST230 {

    private int index = 0;

    public int kthSmallest(TreeNode root, int k) {
        return f(root, k);
    }

    private int f(TreeNode n, int k) {
        if (n == null) {
            return -1;
        }

        int res = f(n.left, k);
        if (res != -1) {
            return res;
        }
        index++;
        if (index == k) {
            return n.val;
        }
        res = f(n.right, k);
        return res;
    }
}
