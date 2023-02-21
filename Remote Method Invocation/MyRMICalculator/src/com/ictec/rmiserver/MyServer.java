package com.ictec.rmiserver;

import com.ictec.rmical.Calculator;
import com.ictec.rmical.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            //1. Create the registry.
            Registry myReg = LocateRegistry.createRegistry(54321);
            //2. Binding the remote object
            Calculator myCal = new MyCalculator();
            myReg.rebind("MyCalculatorServer", myCal);

            //To identify the server is running
            System.out.println("[My Calculator server is Running]");
        } catch (RemoteException e) {
            System.out.println("[Exception in creating Registry: " + e.getMessage() + "]");
        }
    }
}
