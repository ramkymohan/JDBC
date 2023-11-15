package org.EmployeeManagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Initialize the EmployeeManagementSystem and connect to the database
        Scanner sc = new Scanner(System.in);
        EmployeMangementSystem ems = new EmployeMangementSystem();
        int choice;
        do {
            System.out.println("Employ Management System Menu");
            System.out.println("1. InsertEmployee");
            System.out.println("2. updateEmployee");
            System.out.println("3. getEmployeeById");
            System.out.println("4. insertEmployeeAttendance");
            System.out.println("5. generatePayslip");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // insert employee
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("enter empid:");
                    String empid = scanner.nextLine();
                    System.out.println("enter employee name:");
                    String emp_name=scanner.nextLine();
                    System.out.println("enter dob(yyyy-mm-dd):");
                    String dob = scanner.nextLine();
                    System.out.println("enter doj(yyyy-mm-dd):");
                    String doj = scanner.nextLine();
                    ems.insertEmployee(empid,emp_name,dob,doj);
                    break;
                case 2:
                    // update employe
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("enter the emp id:");
                    String empid1 = sc1.nextLine();
                    System.out.println("enter employee name:");
                    String emp_name1=sc1.nextLine();
                    System.out.println("enter dob(yyyy-mm-dd):");
                    String dob1 = sc1.nextLine();
                    System.out.println("enter doj(yyyy-mm-dd):");
                    String doj1 = sc1.nextLine();
                    ems.updateEmployee(empid1,emp_name1,dob1,doj1);

                    break;
                case 3:
                    // Get Employee by id
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Ente the emp_id");
                    String empid2 = sc2.nextLine();
                    ems.getEmployeeById(empid2);

                    break;
                case 4:
                    // Select Policy

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }



        // Create an Employee object and insert it into the database

        // Set employee details


        // Retrieve an employee by ID and update their information

        // Update employee details


        // Create EmployeeAttendance objects and insert them into the database

        // Calculate pay details and generate payslips

        // Display the final list of employees and their pay details

}
