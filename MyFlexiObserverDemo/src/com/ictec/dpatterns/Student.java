package com.ictec.dpatterns;

public class Student implements MyObserver{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("I am "+ this.name + ". I got the message : " + msg);
    }
}
