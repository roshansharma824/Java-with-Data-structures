package com.company.Offline.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJdbc {
    public static void main(String ar[])
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");

            while(rs.next())
            {
                String sid = rs.getNString("id");
                String Sname = rs.getString("name");
                String Sage = rs.getString("age");
                System.out.println(sid +" "+Sname+" "+Sage);
            }
            conn.close();
        }catch(Exception e)
        {
            System.out.println("Error hai");
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}
