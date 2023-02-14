package com.ictec.deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.ictec.serilalization.Student;

import javax.sound.midi.Soundbank;

public class MyDeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ICT_Common_Sem1\\IdeaProjects\\MySerializationDemo\\stu.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu = (Student) ois.readObject();

            System.out.println("Student ID: " + stu.getId());
            System.out.println("Student Name: " + stu.getName());

            System.out.println("Student Age: " + Student.getAge());

            System.out.println("Student Password: " + stu.getPassword());

            fis.close();
            ois.close();

        }catch (Exception e){
            System.out.println("Exception Hit -> " + e);
        }
    }
}
