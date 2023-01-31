package com.ictec.threads;

public class NewCountDownClock implements Runnable{

    int startTime;

    public NewCountDownClock(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public void run() {
        System.out.println("T minus " + startTime);
    }
}
