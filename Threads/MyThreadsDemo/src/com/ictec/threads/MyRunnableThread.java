package com.ictec.threads;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Num : " + i);
        }
    }
}
