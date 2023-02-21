package com.ictec.servers;

import com.ictec.stu.Department;
import com.ictec.stu.DepartmentStudent;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FoTServer {
    public static void main(String[] args) {
        try {
            Department depStu = new DepartmentStudent();
            Registry reg = LocateRegistry.createRegistry(54325);
            reg.rebind("ICTStudents", depStu);

            System.out.println("[FOT Server is Running]");

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
