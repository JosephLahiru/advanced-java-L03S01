package com.fot.ictecservers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MyServer {
    public static void main(String[] args) {
        ServerSocket myServer;
        Socket myClient;
        DataInputStream dis;
        DataOutputStream dos;
        Random random = new Random();

        String[] quotes = {
                "Be yourself; everyone else is already taken.",
                "To live is the rarest thing in the world. Most people exist, that is all.",
                "True friends stab you in the front.",
                "Women are made to be Loved, not understood.",
                "Be the change that you wish to see in the world.",
                "Live as if you were to die tomorrow. Learn as if you were to live forever.",
                "No one can make you feel inferior without your consent.",
                "Great minds discuss ideas; average minds discuss events; small minds discuss people.",
                "Do what you feel in your heart to be right - for you'll be criticized anyway.",
                "Do one thing every day that scares you.",
                "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate; only love can do that.",
                "Our lives begin to end the day we become silent about things that matter.",
                "In the end, we will remember not the words of our enemies, but the silence of our friends.",
                "Injustice anywhere is a threat to justice everywhere.",
                "The time is always right to do what is right.",
                "Life's most persistent and urgent question is, 'What are you doing for others?"
        };


        try {
            myServer = new ServerSocket(55555);
            myClient = myServer.accept();
            dis = new DataInputStream(myClient.getInputStream());
            dos = new DataOutputStream(myClient.getOutputStream());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        while(true) {
            try {
                String msg = dis.readUTF();
                System.out.println(msg);
                if(msg.equalsIgnoreCase("hello...!!!")){
                    dos.writeUTF("Hello...!!!");
                    dos.flush();
                } else if (msg.equalsIgnoreCase("get")) {
                    dos.writeUTF(quotes[random.nextInt(quotes.length)]);
                    dos.flush();
                } else if (msg.equalsIgnoreCase("bye")) {
                    myClient.close();
                    break;
                }else{
                    dos.writeUTF("msg not recognized!!!");
                    dos.flush();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
