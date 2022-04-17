package com.lemonade.leetcode.t2000;


import com.lemonade.leetcode.common.TreeNode;

@SuppressWarnings("unused")
public class MaximumDifferenceBetweenNodeAndAncestor1026 {

    static class NodeInfo {
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
        int max;
        int min;
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
