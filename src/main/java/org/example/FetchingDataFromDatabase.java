package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchingDataFromDatabase {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "root";
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM `employeeDetails` ");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+
                        rs.getString(3)+" "+rs.getString(4));
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
