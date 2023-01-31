package com.ictec.threads;

public class CountDownTimerDemo {
    public static void main(String[] args) {
        CountDownTimer ct = new CountDownTimer();
        Thread t1 = new Thread(ct);

        t1.start();
    }
}