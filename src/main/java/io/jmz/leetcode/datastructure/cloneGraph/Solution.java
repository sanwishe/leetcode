package io.jmz.leetcode.datastructure.cloneGraph;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Stack<Node> dfsStack = new Stack<>();
        dfsStack.push(node);

        Node newRoot = new Node(node.val);

        while (!dfsStack.isEmpty()) {
            Node n = dfsStack.pop();

            if (n.neighbors != null) {

            }
        }

        return newRoot;
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}


