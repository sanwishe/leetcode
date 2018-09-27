package io.jmz.leetcode.junior.longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) {
            return s;
        }

        int palindromeLen = 0;
        String palindrome = "";
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;
                }

                for (int m = 0, n = j; m <= n; m++, n--) {
                    if (s.charAt(i + m) != s.charAt(n)) {
                        break;
                    }

                    if ((n - m - j < 2) && (j - i + 1 > palindromeLen)) {
                        palindromeLen = j - i + 1;
                        palindrome = s.substring(i, j);
                    }
                }
            }
        }

        return palindrome;
    }
}
