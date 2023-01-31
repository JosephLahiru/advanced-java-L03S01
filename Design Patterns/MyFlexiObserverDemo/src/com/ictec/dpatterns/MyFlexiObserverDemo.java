package com.ictec.dpatterns;

public class MyFlexiObserverDemo {
    public static void main(String[] args) {

        Student nimal = new Student("Nimal");
        Student kamala = new Student("Kamala");

        TecMisAdmin admin = new TecMisAdmin();

        admin.registerObserver(nimal);
        admin.registerObserver(kamala);
        //admin.removeObserver(stu);

        admin.sendMessage();
    }
}
