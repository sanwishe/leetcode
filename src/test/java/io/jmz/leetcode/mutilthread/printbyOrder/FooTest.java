package io.jmz.leetcode.mutilthread.printbyOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void testCase1() {
        // given
        Foo foo = new Foo();

        //then
        Thread thread1 = new Thread(
                () -> {
                    try {
                        foo.first(() -> foo.one());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    try {
                        foo.second(() -> foo.two());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        Thread thread3 = new Thread(
                () -> {
                    try {
                        foo.third(() -> foo.three());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );



        //then
        thread3.start();
        thread1.start();
        thread2.start();
    }

}