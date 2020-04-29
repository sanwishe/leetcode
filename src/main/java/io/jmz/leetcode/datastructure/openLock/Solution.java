package io.jmz.leetcode.datastructure.openLock;

import java.util.*;

public class Solution {
    public int openLock(String[] deadends, String target) {
        int step = 0;
        boolean found = false;
        Set<String> deadEndSet = new HashSet<>(Arrays.asList(deadends));

        if (deadEndSet.contains(target)) {
            return step;
        }

        int[] start = new int[]{0,0,0,0};

        LinkedList<int[]> bfsQueue = new LinkedList<>();
        HashSet<String> bfsTried = new HashSet<>();
        bfsQueue.offer(start);
        bfsTried.add(toStrCode(start));

        while (!bfsQueue.isEmpty()) {
            int queueSize = bfsQueue.size();

            step++;
            for (int i = 0; i < queueSize; i++) {
                int[] cur = bfsQueue.remove();

                // add 8 neighbors
                for (int p = 0; p < 4; p++) {
                    // clockwise
                    int[] copied4Up = Arrays.copyOf(cur, cur.length);
                    copied4Up[p] = (copied4Up[p] + 1) % 10;

                    String upNeighbor = toStrCode(copied4Up);
                    if (upNeighbor.equals(target)) {
                        found = true;
                        return step;
                    }

                    if (!bfsTried.contains(upNeighbor) && !deadEndSet.contains(upNeighbor)) {
                        bfsQueue.offer(copied4Up);
                        bfsTried.add(upNeighbor);
                    }

                    // counterClockwise
                    int[] copiedDown = Arrays.copyOf(cur, cur.length);
                    copiedDown[p] = copiedDown[p] == 0 ? 9 : copiedDown[p] - 1;
                    String downNeighbor = toStrCode(copiedDown);

                    if (downNeighbor.equals(target)) {
                        found = true;
                        return step;
                    }

                    if (!bfsTried.contains(downNeighbor) && !deadEndSet.contains(downNeighbor)) {
                        bfsQueue.offer(copiedDown);
                        bfsTried.add(downNeighbor);
                    }
                }
            }
        }

        return found ? step : -1;
    }

    private static String toStrCode(int[] code) {
        return String.format("%d%d%d%d", code[0], code[1], code[2], code[3]);
    }
}
