package com.ictec.serilalization;

import java.io.*;

public class MySerializationDemo{
    public static void main(String[] args) {
        Student stu = new Student(1, "Joe");
        Student.setAge(23.9); //Static Field
        stu.setPassword(23L);

        try {
            FileOutputStream fos = new FileOutputStream("stu.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            fos.close();
            oos.close();

            System.out.println("Serialization Completed!!!");
        } catch (Exception e) {
            System.out.println("Hit an Exception : " + e);
        }
    }
}
