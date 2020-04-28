package io.jmz.leetcode.datastructure.numIslands;

import java.util.LinkedList;

public class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    markIsland(grid, i, j);
                }
            }
        }

        return num;
    }

    private void markIsland(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }

        if (grid[i][j] != '1') {
            return;
        }

        grid[i][j] = 'M';

        markIsland(grid, i - 1, j); // up
        markIsland(grid, i + 1, j); // down
        markIsland(grid, i, j - 1); // left
        markIsland(grid, i, j + 1); // right
    }
}
