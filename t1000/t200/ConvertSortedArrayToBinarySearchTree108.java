package com.lemonade.leetcode.t1000.t200;

@SuppressWarnings("unused")
public class ConvertSortedArrayToBinarySearchTree108 {
    static class TreeNode {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return f(nums, 0, nums.length - 1);
    }

    TreeNode f(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        if (l == r) {
            return new TreeNode(nums[l]);
        }

        int t = l + (r - l) / 2;
        TreeNode tN = new TreeNode(nums[t]);
        tN.left = f(nums, l, t - 1);
        tN.right = f(nums, t + 1, r);
        return tN;
    }
}
