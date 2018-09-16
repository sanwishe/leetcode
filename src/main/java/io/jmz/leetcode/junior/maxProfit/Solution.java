package io.jmz.leetcode.junior.maxProfit;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int earned = 0;
        for (int i = 1; i < prices.length; i++) {
            earned += prices[i] > prices[i -1] ? prices[i] - prices[i -1] : 0;
        }

        return earned;
    }
}
