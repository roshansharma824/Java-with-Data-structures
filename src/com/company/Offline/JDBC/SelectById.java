package com.company.Offline.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectById {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String id1 = s.nextLine();

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String query = "select *from employee where id = '"+id1+"' ";
            String usernname = "SYSTEM";
            String password = "SYSTEM";


            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url,usernname,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String age = rs.getString(3);
                System.out.println("ID "+"       "+"Name   "+"                                  "+"Age");
                System.out.println(id+""+name+""+age);

            }
        } catch (Exception e) {
            System.out.println("Error Hai");
            e.printStackTrace();
        }
    }
}
