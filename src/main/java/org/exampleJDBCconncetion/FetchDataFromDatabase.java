package org.exampleJDBCconncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataFromDatabase {
    public static void main(String[] args) {
       try {
           Connection con= DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/jdbc","root","root");
           Statement stmt=con.createStatement();
           ResultSet resultSet=stmt.executeQuery("select * from employeeDetails");
           System.out.println(resultSet);
           while (resultSet.next()){
               System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
