package com.fot.ictecclients;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Scanner input;
        Socket myClient;
        DataOutputStream dos;
        DataInputStream dis;
        try {
            input = new Scanner(System.in);
            myClient = new Socket("localhost", 55555);
            dos = new DataOutputStream(myClient.getOutputStream());
            dis = new DataInputStream(myClient.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(true) {
            try {
                System.out.print("Enter a message to sent to server: ");
                String msg = input.nextLine();
                dos.writeUTF(msg);
                dos.flush();

                if(msg.equalsIgnoreCase("bye")){
                    myClient.close();
                    break;
                }

                //reading from server
                msg = dis.readUTF();
                //print the data
                System.out.println(msg);
                if(msg.equalsIgnoreCase("bye")){
                    myClient.close();
                    break;
                }


            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }


}
