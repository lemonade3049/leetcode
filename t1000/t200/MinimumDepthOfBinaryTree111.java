package com.lemonade.leetcode.t1000.t200;

import com.lemonade.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unused")
public class MinimumDepthOfBinaryTree111 {

    public int minDepth(TreeNode root) {
        return bfs(root);
    }

    int dfs(TreeNode n) {
        if (n == null) {
            return 0;
        } else if (n.left == null) {
            return dfs(n.right) + 1;
        } else if (n.right == null) {
            return dfs(n.left) + 1;
        } else {
            return Math.min(dfs(n.left), dfs(n.right)) + 1;
        }
    }

    // bfs is much better than dfs...
    int bfs(TreeNode n) {
        if (n == null) {
            return 0;
        }
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(n);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                assert t != null;
                if (t.left == null && t.right == null) {
                    return depth;
                }
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer((t.right));
                }
            }
            depth++;
        }
        return depth;
    }
}
