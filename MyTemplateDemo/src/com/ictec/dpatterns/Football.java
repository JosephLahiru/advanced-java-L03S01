package com.ictec.dpatterns;

public class Football extends Game{
    @Override
    public void initialize() {
        System.out.println("Initializing Football...!!!");
    }

    @Override
    public void startPlay() {
        System.out.println("Start Playing Football...!!!");
    }

    @Override
    public void endPlay() {
        System.out.println("End Playing Football...!!!");
    }
}
