package io.jmz.leetcode.junior.longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {

        if (null == s || s.isEmpty()) {
            return s;
        }
        int len = s.length();
        int palindromeLen = 0;
        String palindrome = "";
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;
                }

                for (int m = 0, n = j; m + i <= n; ++m, --n) {
                    if (s.charAt(i + m) != s.charAt(n)) {
                        break;
                    }

                    if ((s.charAt(i + m) == s.charAt(n)) && (n - m - i <= 2) && (j - i + 1 > palindromeLen)) {
                        palindromeLen = j - i + 1;
                        palindrome = s.substring(i, j + 1);
                        break;
                    }
                }
            }
        }

        return palindromeLen == 0 ? s.substring(0, 1) : palindrome;
    }
}
