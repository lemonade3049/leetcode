package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        return f(root).isBalanced;
    }

    RInfo f(TreeNode tN) {
        if (tN == null) {
            return new RInfo(0, true);
        }
        RInfo l = f(tN.left);
        RInfo r = f(tN.right);

        if (l.isBalanced && r.isBalanced && Math.abs(l.height - r.height) <= 1) {
            return new RInfo(Math.max(l.height, r.height) + 1, true);
        } else {
            return new RInfo(0, false);
        }
    }
}


class RInfo {
    int height;
    boolean isBalanced;

    RInfo(int h, boolean i) {
        height = h;
        isBalanced = i;
    }
}
