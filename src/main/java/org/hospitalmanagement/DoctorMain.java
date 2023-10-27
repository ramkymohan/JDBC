package org.hospitalmanagement;
import java.util.*;
public class DoctorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor ID: ");
        int doctorID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();
        DoctorUtil doctorUtil = new DoctorUtil();
        doctorUtil.addDoctor(doctorID,doctorName,specialization);
        doctorUtil.displayAllDoctors();
    }
}
