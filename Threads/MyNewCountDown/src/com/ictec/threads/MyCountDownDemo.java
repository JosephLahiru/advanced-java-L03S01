package com.ictec.threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyCountDownDemo {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor myPool;
        Runnable flood, ignite, lift;

        myPool = new ScheduledThreadPoolExecutor(3);
        flood = new NewLaunchEvent("Flooding...!!!");
        ignite = new NewLaunchEvent("Ignite...!!!");
        lift = new NewLaunchEvent("Lift off...!!!");


        for (int i = 20; i >= 0; i--) {
            myPool.schedule(new NewCountDownClock(i), 20-i, TimeUnit.SECONDS);
        }
        myPool.schedule(flood, 4L, TimeUnit.SECONDS);
        myPool.schedule(ignite, 14L, TimeUnit.SECONDS);
        myPool.schedule(lift, 20L, TimeUnit.SECONDS);

        myPool.shutdown();
    }
}
