package com.lemonade.leetcode.t1000.t200;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode116 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    /**
     * this can work but need extra space(Queue)
     *
     * @param root
     * @return
     */
    public Node connect1(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> p = new LinkedList<>();

        p.offer(root);
        Node pre = null;
        while (!p.isEmpty()) {
            Node curr = p.poll();
            if (pre != null) {
                pre.next = curr;
            }
            if (curr.left != null) {
                p.offer(curr.left);
            }
            if (curr.right != null) {
                p.offer(curr.right);
            }
            pre = curr;
        }

        Node n = root;
        while (n != null) {
            n.next = null;
            n = n.right;
        }
        return root;
    }

    public Node connect(Node root) {
        Node n = root;
        if (n == null) {
            return null;
        }
        f(root);
        return root;
    }

    void f(Node n) {
        if (n == null) {
            return;
        }
        if (n.left != null) {
            n.left.next = n.right;
        }

        if (n.next != null && n.right != null) {
            n.right.next = n.next.left;
        }

        f(n.right);
        f(n.left);

    }


}
