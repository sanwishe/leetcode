package io.jmz.leetcode.junior.found_median;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newLen = 1 + (nums1.length + nums2.length) / 2;
        int[] newArr = new int[newLen];

        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < newLen; i++) {
            if (pos1 < nums1.length && pos2 < nums2.length && (nums1[pos1] < nums2[pos2])) {
                newArr[i] = nums1[pos1++];
            } else if (pos2 < nums2.length) {
                newArr[i] = nums2[pos2++];
            } else if (pos1 < nums1.length) {
                newArr[i] = nums1[pos1++];
            }
        }

        return ((nums1.length + nums2.length) % 2 == 1) ? newArr[newLen - 1] : (newArr[newLen - 1] + newArr[newLen - 2]) / 2.0;
    }
}
