package com.ictec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UniversityEmployee extends Employee implements Serializable {
    private int uId;

    public UniversityEmployee(String name, int uId) {
        super(name);
        this.uId = uId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    private void writeObject(ObjectOutputStream ous) throws IOException {
        ous.defaultWriteObject();
        ous.writeObject(getName()); // because String is an object
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
        ois.defaultReadObject();
        setName((String) ois.readObject());
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
                "name=" + getName() +
                ", uId=" + uId +
                '}';
    }
}
