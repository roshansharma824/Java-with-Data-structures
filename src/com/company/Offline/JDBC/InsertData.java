package com.company.Offline.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] ar) {
        try {

            Scanner s = new Scanner(System.in);

            String i = s.nextLine();
            String n = s.nextLine();
            String a = s.nextLine();


            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");

            Statement stmt = conn.createStatement();
//            "'+i+'","'+n+'","'+a+'"
            int aa = stmt.executeUpdate("insert into employee values('"+i+"','"+n+"','"+a+"')");

        }
        catch (Exception e){
            System.out.println("error hai");

        }
    }
}
