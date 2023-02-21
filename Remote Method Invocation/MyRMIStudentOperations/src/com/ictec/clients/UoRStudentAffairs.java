package com.ictec.clients;

import com.ictec.stu.Department;
import com.ictec.stu.Student;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class UoRStudentAffairs {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(54325);
            Department ict = (Department) reg.lookup("ICTStudents");

            ArrayList<Student> students = ict.getStudents();

            int i = 0;
            for (Student stu : students) {
                System.out.println("Details of " + i + " Student.\n");

                System.out.println("Student ID:         " + stu.getStu_id());
                System.out.println("Student Name:       " + stu.getStu_name());
                System.out.println("Student Address:    " + stu.getStu_address());
                System.out.println("---------------------------------------------");

                i++;
            }

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
