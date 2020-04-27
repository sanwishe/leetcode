package io.jmz.leetcode.datastructure.circular;

import java.util.NoSuchElementException;

public class MyCircularQueue {

    private final int[] queueInternal;
    private final int cap;
    private int header;
    private int tail;
    private int size;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        this.queueInternal = new int[k];
        this.cap = k;
        this.header = this.tail = -1;
        this.size = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (this.size >= this.cap) {
            return false;
        }

        int insertIndex = this.tail == this.cap - 1 ? 0 : this.tail + 1;

        this.queueInternal[insertIndex] = value;
        this.size++;

        if (this.header == -1) {
            this.header++;
        }

        this.tail = insertIndex;

        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (this.size == 0) {
            return false;
        }

        if (this.header == this.tail) {
            this.header = this.tail = -1;
            this.size--;
            return true;
        }

        int dequeueIndex = this.header == this.cap - 1 ? 0 : this.header + 1;
        this.header = dequeueIndex;
        this.size--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (!this.isEmpty()) {
            return this.queueInternal[header];
        }

        throw new NoSuchElementException();
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (!this.isEmpty()) {
            return this.queueInternal[this.tail];
        }
        throw new NoSuchElementException();
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return this.cap == this.size;
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */