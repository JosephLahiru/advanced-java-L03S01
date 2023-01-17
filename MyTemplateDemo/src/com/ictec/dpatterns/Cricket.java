package com.ictec.dpatterns;

public class Cricket extends Game{
    @Override
    public void initialize() {
        System.out.println("Initializing Cricket...!!!");
    }

    @Override
    public void startPlay() {
        System.out.println("Start Playing Cricket...!!!");
    }

    @Override
    public void endPlay() {
        System.out.println("End Playing Cricket...!!!");
    }
}
