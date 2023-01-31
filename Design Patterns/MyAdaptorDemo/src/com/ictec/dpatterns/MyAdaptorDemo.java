package com.ictec.dpatterns;

public class MyAdaptorDemo {
    public static void main(String[] args) {
        SimpleNameClass sn = new SimpleNameClass();

        sn.setName("Saman Nandasiri");

        SimpleToComplexAdaptor scAdaptor = new SimpleToComplexAdaptor(sn);

        System.out.println("First Name: " + scAdaptor.getFName());
        System.out.println("Last Name: " + scAdaptor.getLName());

//        System.out.println("Name: " + sn.getName());

//        ComplexNameClass cn = new ComplexNameClass();
//
//        cn.setFName("Saman");
//        cn.setLName("Nandasiri");
//
//        System.out.println("Name: " + cn.getFName() + " " + cn.getLName());
    }
}
