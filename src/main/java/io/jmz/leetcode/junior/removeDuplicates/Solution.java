package io.jmz.leetcode.junior.removeDuplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[pos]) {
                nums[++pos] = nums[i];
            }
        }

        return pos + 1;
    }
}
