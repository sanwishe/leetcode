package io.jmz.leetcode.datastructure.validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char pre = stack.pop();
            switch (c) {
                case ')':
                    if (pre != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (pre != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (pre != '{') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        if (stack.size() == 0) {
            return true;
        }

        return false;
    }
}
