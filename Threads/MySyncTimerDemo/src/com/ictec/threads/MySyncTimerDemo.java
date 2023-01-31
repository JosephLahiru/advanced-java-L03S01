package com.ictec.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MySyncTimerDemo {
    public static void main(String[] args) {
        CountDownClockSync clock = new CountDownClockSync(20);
        ScheduledThreadPoolExecutor myPool = new ScheduledThreadPoolExecutor(2);

        myPool.execute(clock);
        myPool.execute(clock);
        myPool.shutdown();
    }
}
