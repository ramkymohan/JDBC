package org.EmployeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static String url="jdbc:mysql://localhost:3306/employeeDetails";
    private static String user="root";
    private static String password="root";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
