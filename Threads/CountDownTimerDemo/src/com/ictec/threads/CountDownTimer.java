package com.ictec.threads;

public class CountDownTimer implements Runnable{
    @Override
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("T Minus " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
