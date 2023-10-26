package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataIntoDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "root";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        int empid=5;
        String firstname="ramky";
        String lastname="kumar";
        String gender="male";
        try {
            String query = "INSERT INTO `employeeDetails` VALUES ('"+empid+"','"+firstname+"','"+lastname+"','"+gender+"')";
            Connection con=DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            int i=stmt.executeUpdate(query);
            if(i == 1){
                System.out.println("Inserted Successfully : "+query);
            }
            else{
                System.out.println("Insertion Failed.");
            }
            stmt.close();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
