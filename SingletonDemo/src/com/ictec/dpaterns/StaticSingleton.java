package com.ictec.dpaterns;

public class StaticSingleton {
    private static StaticSingleton ss;

    private StaticSingleton(){}

    static {
        try{
            ss = new StaticSingleton();
        }catch(Exception e){
            throw new RuntimeException();
        }
    }

    public static StaticSingleton getInstance(){
        return ss;
    }

    public void sayHello(){
        System.out.println("Hello From Static...!");
    }
}
