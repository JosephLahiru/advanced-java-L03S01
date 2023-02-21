package com.ictec.stu;

import java.sql.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class DepartmentStudent extends UnicastRemoteObject implements Department {
    public DepartmentStudent() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Student> getStudents() throws RemoteException {

        ArrayList<Student> stu_arr = new ArrayList<Student>();

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "ict4123PwdAdmin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStatement = myConn.createStatement();

            String myQuery = "SELECT * FROM basicdata";
            ResultSet rs = myStatement.executeQuery(myQuery);

            while (rs.next()) {
                Student stu = new Student();
                stu.setStu_id(rs.getString(1));
                stu.setStu_name(rs.getString(2));
                stu.setStu_address(rs.getString(3));

                stu_arr.add(stu);
            }
            myConn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return stu_arr;
    }
}
