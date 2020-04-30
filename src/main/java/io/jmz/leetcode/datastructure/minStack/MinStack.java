package io.jmz.leetcode.datastructure.minStack;

import java.util.Arrays;

public class MinStack {
    private int[] stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.stack = new int[]{};
    }

    public void push(int x) {
        if (this.stack == null) {
            this.stack = new int[]{};
        }

        this.stack = Arrays.copyOf(this.stack, this.stack.length + 1);

        this.stack[this.stack.length - 1] = x;
    }

    public void pop() {
        if (this.stack.length <= 1) {
            this.stack = new int[]{};
        }

        this.stack = Arrays.copyOf(this.stack, this.stack.length - 1);
    }

    public int top() {
        return this.stack[this.stack.length - 1];
    }

    public int getMin() {
        int min = this.stack[0];
        for (int i = 1; i < this.stack.length; i++) {
            min = Math.min(this.stack[i], min);
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
