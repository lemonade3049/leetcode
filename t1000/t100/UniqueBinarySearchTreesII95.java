package com.lemonade.leetcode.t1000.t100;

import com.lemonade.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class UniqueBinarySearchTreesII95 {

    public List<TreeNode> generateTrees(int n) {
        return f(1, n);
    }

    private List<TreeNode> f(int start, int end) {
        if (start > end) {
            return null;
        }
        List<TreeNode> ret = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            List<TreeNode> left = f(start, i - 1);
            List<TreeNode> right = f(i + 1, end);
            if (left == null && right == null) {
                ret.add(new TreeNode(start));
            } else if (left == null) {
                for (TreeNode treeNode : right) {
                    TreeNode curr = new TreeNode(i);
                    curr.right = treeNode;
                    ret.add(curr);
                }
            } else if (right == null) {
                for (TreeNode treeNode : left) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = treeNode;
                    ret.add(curr);
                }
            } else {
                for (TreeNode treeNode : left) {
                    for (TreeNode node : right) {
                        TreeNode curr = new TreeNode(i);
                        curr.left = treeNode;
                        curr.right = node;
                        ret.add(curr);
                    }
                }
            }
        }
        return ret;
    }
}
