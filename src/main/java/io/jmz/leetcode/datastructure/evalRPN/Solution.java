package io.jmz.leetcode.datastructure.evalRPN;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> innerStack = new Stack<>();

        for (String token : tokens) {
            try {
                int t = Integer.parseInt(token, 10);
                innerStack.push(t);
            } catch (NumberFormatException e) {
                int right = innerStack.pop();
                int left = innerStack.pop();
                switch (token) {
                    case "+":
                        res = left + right;
                        break;
                    case "-":
                        res = left - right;
                        break;
                    case "*":
                        res = left * right;
                        break;
                    case "/":
                        res = left / right;
                        break;
                    default:
                        throw new RuntimeException("unknown operator:" + token);
                }
                innerStack.push(res);
            }
        }

        return innerStack.pop();
    }
}
