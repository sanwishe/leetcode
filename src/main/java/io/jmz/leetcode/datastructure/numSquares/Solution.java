package io.jmz.leetcode.datastructure.numSquares;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int numSquares(int n) {
        int num = 0;

        if (n <= 0) {
            return num;
        }

        HashSet<Integer> sumPresented = new HashSet<>();

        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.offer(0);

        while (!bfsQueue.isEmpty()) {
            int roundLen = bfsQueue.size();
            outer:
            for (int r = 0; r < roundLen; r++) {
                int cur = bfsQueue.remove();

                if (cur == n) {
                    return num;
                }

                for (int i = 1; ; i++) {
                    int sum = cur + i * i;
                    if (sum <= n && !sumPresented.contains(sum)) {
                        bfsQueue.offer(sum);
                        sumPresented.add(sum);
                    }

                    if (sum > n && r < roundLen - 1) {
                        break;
                    } else if (sum > n) {
                        break outer;
                    }
                }
            }
            num++;
        }

        return num;
    }
}
