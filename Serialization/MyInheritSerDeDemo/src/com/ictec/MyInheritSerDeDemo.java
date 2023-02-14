package com.ictec;

public class MyInheritSerDeDemo {
    public static void main(String[] args) {
        Serializer ser = new Serializer();
        Deserializer deSer = new Deserializer();

//        Cat c = new Cat(10.0, "gold");
//        ser.serializeCat(c);
//        deSer.deserializeCat();

        UniversityEmployee uemp = new UniversityEmployee("Saman", 1234);
        ser.serializeEmp(uemp);
        deSer.deserializeEmp();
    }
}
