package org.EmployeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeMangementSystem {
    public void insertEmployee(String empid,String empname,String dob,String doj) {
        // Code to insert employee data into the database
        String query = "insert into employee(empid,empname,dob,doj) values('"+empid+"','"+empname+"','"+dob+"','"+doj+"')";
        System.out.println(query);
        try(Connection connection = DataBaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Inserted employee successfully...");
            } else {
                System.out.println("Failed to insertion.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployee(String empid,String empname,String doj,String dob) {
        // Code to update employee data in the database
        String query="update employee set empname='"+empname+"',dob='"+dob+"',doj='"+doj+"' where empid='"+empid+"'";
        System.out.println(query);
        try(Connection connection = DataBaseConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("update employee by id successfull...");
            } else {
                System.out.println("Failed to updation.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getEmployeeById(String empId) {
        // Code to retrieve an employee by empId from the database
        String queries = "select * from employee where";
    }

    public void insertEmployeeAttendance(EmployeeAttandance attendance) {
        // Code to insert attendance data into the database
    }

    public void generatePayslip(PayDetails payDetails) {
        // Code to calculate pay details and generate a payslip
    }

    // Other methods for database operations
}
