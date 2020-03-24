package io.jmz.leetcode.mutilthread.printbyOrder;

import java.util.concurrent.atomic.AtomicInteger;

public class Foo {
    private static AtomicInteger sign = new AtomicInteger(0);

    public Foo() {
    }

    public void one() {
        System.out.print("one");
    }

    public void two() {
        System.out.print("two");
    }

    public void three() {
        System.out.print("three");
    }


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        sign.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        for (; ; ) {
            if (sign.get() == 1) {
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                sign.incrementAndGet();
                break;
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        for (; ; ) {
            if (sign.get() == 2) {
                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();
                break;
            }
        }
    }
}
