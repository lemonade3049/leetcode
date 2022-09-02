package com.lemonade.leetcode.t1000.t700;

import com.lemonade.leetcode.common.TreeNode;

import java.util.*;

@SuppressWarnings("unused")
public class AverageOfLevelsInBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int num = 0;
            Queue<TreeNode> newQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                num++;
                sum += node.val;
                if(node.left != null){
                    newQueue.add(node.left);
                }
                if(node.right != null){
                    newQueue.add(node.right);
                }
            }
            list.add(sum / num);
            queue = newQueue;
        }
        return list;
    }
}
