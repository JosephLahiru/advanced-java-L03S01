package com.ictec.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ICT_Common_Sem1\\IdeaProjects\\MySerializationDemo\\stu.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu = (Student) ois.readObject();
        }catch (Exception e){
            System.out.println("Exception Hit : " + e);
        }
    }
}
