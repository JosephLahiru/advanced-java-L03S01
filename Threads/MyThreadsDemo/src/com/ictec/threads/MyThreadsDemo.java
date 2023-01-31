package com.ictec.threads;

public class MyThreadsDemo {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        MyRunnableThread run1 = new MyRunnableThread();
        Thread th3 = new Thread(run1);

        MyRunnableThread run2 = new MyRunnableThread();
        Thread th4 = new Thread(run2);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}