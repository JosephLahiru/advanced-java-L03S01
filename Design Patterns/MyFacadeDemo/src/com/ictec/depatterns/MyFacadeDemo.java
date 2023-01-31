package com.ictec.depatterns;
import java.util.Scanner;

public class MyFacadeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        DifficultReg dr = new DifficultReg();

//        System.out.print("Enter your First Character: ");
//        dr.setFirstChar(sc.next().charAt(0));
//        System.out.print("Enter your Second Character: ");
//        dr.setSecondChar(sc.next().charAt(0));
//        System.out.print("Enter your Third Character: ");
//        dr.setThirdChar(sc.next().charAt(0));
//        System.out.print("Enter your Fourth Character: ");
//        dr.setFourthChar(sc.next().charAt(0));
//        System.out.print("Enter your Fifth Character: ");
//        dr.setFifthChar(sc.next().charAt(0));

//        System.out.println("Your Registration Number is " + dr.getRegNo());

        SimpleRegFacade srf = new SimpleRegFacade();

        System.out.print("Enter Your Registration No: ");
        srf.setRegNo(sc.next());

        System.out.println("Your Registration Number is " + srf.getRegNo());
    }
}
