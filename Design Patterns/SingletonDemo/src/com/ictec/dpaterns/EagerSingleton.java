package com.ictec.dpaterns;

public class EagerSingleton {
    private static EagerSingleton es = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return es;
    }

    public void sayHello(){
        System.out.println("Hello From Eager...!");
    }
}
