package org.hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoctorUtil {
    String url = "jdbc:mysql://localhost:3306/doctor";
    String user = "root";
    String password = "root";

    public void addDoctor(int doctorID,String name,String specialization){
        try {
            String query = "INSERT INTO `doctorDetails` values ('"+doctorID+"','"+name+"','"+specialization+"')";
            Connection con= DriverManager.getConnection(url,user,password);
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
    public void displayAllDoctors(){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String query= "select * from doctorDetails";
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            ResultSet resultSet =stmt.executeQuery(query);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
            con.close();
            stmt.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
