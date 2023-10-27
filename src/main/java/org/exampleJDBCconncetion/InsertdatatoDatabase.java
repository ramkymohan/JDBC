package org.exampleJDBCconncetion;

import java.security.PublicKey;
import java.sql.*;

public class InsertdatatoDatabase {
    public static void main(String[] args) {
        int employeeid = 5;
        String firstname = "ramky";
        String lastname = "kumar";
        String gender = "Male";

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";
        try {
            String query = "insert into employeeDetails values("+employeeid+",'"+firstname+"','"+lastname+"','"+gender+"')";
            System.out.println(query);
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            int i=statement.executeUpdate(query);
            if(i==1){
                System.out.println("inserted sucessfully"+query);
            }
            else {
                System.out.println("insertion failed");
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}