package com.ictec.rmical;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator{
    public MyCalculator() throws RemoteException {
        super();
    }
    @Override
    public int addTwoIntegers(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public int subtractTwoIntegers(int x, int y) throws RemoteException {
        return (x-y);
    }

    @Override
    public int multiplyTwoIntegers(int x, int y) throws RemoteException {
        return (x*y);
    }

    @Override
    public double divideTwoDoubles(double x, double y) throws RemoteException {
        return (x/y);
    }
}
