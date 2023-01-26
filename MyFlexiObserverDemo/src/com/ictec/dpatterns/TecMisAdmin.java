package com.ictec.dpatterns;
import java.util.ArrayList;
import java.util.Scanner;

public class TecMisAdmin implements MySubject{
    Scanner sc = new Scanner(System.in);

//    MyObserver stu;
    ArrayList<MyObserver> students = new ArrayList<MyObserver>();
    private String msg;

    @Override
    public void registerObserver(MyObserver obs) {
//        this.stu = obs;
        this.students.add(obs);
    }

    @Override
    public void removeObserver(MyObserver obs) {
//        this.stu = null;
        this.students.remove(obs);
    }

    @Override
    public void notifyObservers() {
//        stu.update(this.msg);
        for (MyObserver stu:students) {
            stu.update(msg);
        }
    }

    public void sendMessage(){
        System.out.print("Please enter the message : ");
        this.msg = sc.next();

        notifyObservers();
    }
}
