package com.ictec.rmiclient;

import com.ictec.rmical.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            //1. Locate the registry
            Registry myReg = LocateRegistry.getRegistry("localhost", 54321);

            //2. Locating the remote object
            Calculator myCal = (Calculator) myReg.lookup("MyCalculatorServer");

            //3. invoke the method
            int result1 = myCal.addTwoIntegers(12, 20);
            int result2 = myCal.subtractTwoIntegers(12, 20);
            int result3 = myCal.multiplyTwoIntegers(12, 20);
            double result4 = myCal.divideTwoDoubles(100, 12);

            System.out.println("Addition of Two Numbers: " + result1);
            System.out.println("Subtraction of Two Numbers: " + result2);
            System.out.println("Multiplication of Two Numbers: " + result3);
            System.out.println("Division of Two Numbers: " + result4);

        } catch (RemoteException e) {
            System.out.println("[Exception in Client: " + e.getMessage() + "]");
        } catch (NotBoundException e) {
            System.out.println("[NotBoundException in Client: " + e.getMessage() + "]");
        } catch (ArithmeticException e){
            System.out.println("[ArithmeticException in Client: " + e.getMessage() + "]");
        }
    }
}
