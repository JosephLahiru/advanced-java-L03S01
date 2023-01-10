package com.ictec.dpaterns;

public class SingletonDemo {
    public static void main(String[] args) {

        EagerSingleton obj1 = EagerSingleton.getInstance();

        System.out.println(obj1);
//        System.out.println(EagerSingleton.getInstance());

//        System.out.println("Hello World...!!!");

//        Student student1 = new Student("Saman");
//        Student student2 = new Student("Kamal");

//        System.out.println("Gender: " + Student.gender);
//
//        Student.getStudent("Kamal");
//
//        System.out.println(Student.name);
//
//        Student.getStudent("Saman");
//
//        System.out.println(Student.name);

    }
}
