package com.lemonade.leetcode.t2000;

import org.w3c.dom.Node;

public class MaximumDifferenceBetweenNodeAndAncestor1026 {

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

    class NodeInfo {
        int max;
        int min;
        int res;

        NodeInfo(int max, int min, int res) {
            this.max = max;
            this.min = min;
            this.res = res;
        }

        NodeInfo() {
        }
    }


    public int maxAncestorDiff(TreeNode root) {
        return f(root).res;
    }

    public NodeInfo f(TreeNode node) {
        if (node == null) {
            return null;
        }

        NodeInfo lInfo = f(node.left);
        NodeInfo rInfo = f(node.right);
        if (lInfo == null && rInfo == null) {
            return new NodeInfo(node.val, node.val, node.val);
        }

        NodeInfo info = new NodeInfo();
        int max = 0;
        int min = 0;
        if (lInfo != null && rInfo != null) {
            max = Math.max(lInfo.max, rInfo.max);
            min = Math.min(lInfo.min, rInfo.min);
        } else if (lInfo != null) {
            max = lInfo.max;
            min = lInfo.min;
        } else {

            max = rInfo.max;
            min = rInfo.min;
        }

        info.res = Math.max(Math.abs(node.val - max), Math.abs(node.val - min));
        if (lInfo != null)
            info.res = Math.max(info.res, lInfo.res);
        if (rInfo != null)
            info.res = Math.max(info.res, rInfo.res);
        info.max = Math.max(node.val, max);
        info.min = Math.min(node.val, min);
        return info;
    }
}
