package io.jmz.leetcode.datastructure.numIslandsBFS;

import java.util.LinkedList;

public class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                if (grid[x][y] != '1') {
                    continue;
                }

                num++;

                LinkedList<Node> queue = new LinkedList<>();
                queue.offer(new Node(x, y));

                while (!queue.isEmpty()) {
                    Node node = queue.remove();
                    grid[node.X][node.Y] = 'M';

                    // up
                    if (node.X - 1 >= 0 && grid[node.X - 1][node.Y] == '1') {
                        queue.offer(new Node(node.X - 1, node.Y));
                    }

                    // down
                    if (node.X + 1 < grid.length && grid[node.X + 1][node.Y] == '1') {
                        queue.offer(new Node(node.X + 1, node.Y));
                    }

                    // left
                    if (node.Y - 1 >= 0 && grid[node.X][node.Y - 1] == '1') {
                        queue.offer(new Node(node.X, node.Y - 1));
                    }

                    // right
                    if (node.Y + 1 < grid[0].length && grid[node.X][node.Y + 1] == '1') {
                        queue.offer(new Node(node.X, node.Y + 1));
                    }
                }
            }
        }

        return num;
    }

    public static class Node {
        private final int X;
        private final int Y;

        public Node(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public int getY() {
            return Y;
        }
    }
}
