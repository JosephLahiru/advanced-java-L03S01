package com.ictec.rmical;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    //add two integers
    public int addTwoIntegers(int x, int y) throws RemoteException;
    public int subtractTwoIntegers(int x, int y) throws RemoteException;
    public int multiplyTwoIntegers(int x, int y) throws RemoteException;
    public double divideTwoDoubles(double x, double y) throws RemoteException, ArithmeticException;

}