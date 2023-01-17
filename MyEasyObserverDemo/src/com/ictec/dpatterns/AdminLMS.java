package com.ictec.dpatterns;

import java.util.Observable;
import java.util.Scanner;

public class AdminLMS extends Observable {
    String lmsMessage;
    Scanner input = new Scanner(System.in);

    public void sendMessage(){
        System.out.print("Please Enter a message to send: ");
        lmsMessage = input.nextLine();

        setChanged();
        notifyObservers();
    }
}
