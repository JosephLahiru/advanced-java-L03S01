package com.ictec.dpaterns;

public class BillPughSingleton {
    //make constructor private
    private BillPughSingleton(){}

    //create the inner class
    private static class Helper{
        //create the private static final object
        private static final BillPughSingleton bps = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Helper.bps;
    }
}
