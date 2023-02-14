package com.ictec;

import java.io.*;

public class Deserializer {
    FileInputStream fis;
    ObjectInputStream ois;
    public void deserializeCat(){
        try {
            fis = new FileInputStream("cat.ser");
            ois = new ObjectInputStream(fis);
            Cat c = (Cat) ois.readObject();

            System.out.println(c.toString());

            fis.close();
            ois.close();

        } catch (Exception e) {
            System.out.println("Exception Hit -> " + e);
            e.printStackTrace();
        }
    }

    public void deserializeEmp(){
        try {
            fis = new FileInputStream("emp.ser");
            ois = new ObjectInputStream(fis);

            UniversityEmployee uemp = (UniversityEmployee) ois.readObject();
            System.out.println(uemp.toString());

            fis.close();
            ois.close();

        } catch (Exception e) {
            System.out.println("Exception Hit -> " + e);
            e.printStackTrace();
        }
    }
}
