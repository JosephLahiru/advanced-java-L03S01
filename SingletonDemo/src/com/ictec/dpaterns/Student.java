package com.ictec.dpaterns;

public class Student {
    static String name;
    static String gender = "Male";

    private Student(String name){
        this.name = name;

        System.out.println("My name is " + this.name);
    }

    public static Student getStudent(String name){
        Student student = new Student(name);

        return student;
    }

}
