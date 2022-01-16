package com.lemonade.leetcode.t1000.t900;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees894 {
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

    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> list = new ArrayList<>();
        if ((n & 1) == 0) {
            return list;
        }
        for (int i = 1; i < n; i = i + 2) {

        }
        return null;
    }

    List<TreeNode> f(int n) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode node = new TreeNode(0);
        return null;
    }
}
