package com.ictec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    FileOutputStream fos;
    ObjectOutputStream oos;

    public void serializeCat(Cat c){
        try {
            fos = new FileOutputStream("cat.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);

            oos.flush();
            fos.close();
            oos.close();

            System.out.println("Serialization Complete...!!!");

        } catch (Exception e) {
            System.out.println("Exception Hit -> " + e);
            e.printStackTrace();
        }
    }

    public void serializeEmp(UniversityEmployee emp){
        try {
            fos = new FileOutputStream("emp.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            oos.flush();
            fos.close();
            oos.close();

            System.out.println("Serialization Complete...!!!");

        } catch (Exception e) {
            System.out.println("Exception Hit -> " + e);
            e.printStackTrace();
        }
    }
}
