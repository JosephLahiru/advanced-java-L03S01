package com.ictec.dpatterns;

public class MyDecoratorDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //System.out.println(computer.description());

        computer = new ComDVD(computer);
        //System.out.println(comDVD.description());

        computer = new ComMonitor(computer);
        System.out.println(computer.description());
    }
}
