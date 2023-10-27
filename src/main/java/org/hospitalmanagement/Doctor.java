package org.hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Doctor {
    private int doctorID;
    private String name;
    private String specialization;

    public Doctor(int doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
