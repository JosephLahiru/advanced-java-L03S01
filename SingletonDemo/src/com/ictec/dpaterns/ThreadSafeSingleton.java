package com.ictec.dpaterns;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton tss;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(tss==null){
            tss = new ThreadSafeSingleton();
        }
        return tss;
    }

    public void sayHello(){
        System.out.println("Hello From Thread Safe...!");
    }
}
