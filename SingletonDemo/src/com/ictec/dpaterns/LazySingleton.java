package com.ictec.dpaterns;

public class LazySingleton {
    private static LazySingleton ls;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(ls==null){
            ls  = new LazySingleton();
        }
        return ls;
    }

    public void sayHello(){
        System.out.println("Hello From Lazy...!");
    }
}
