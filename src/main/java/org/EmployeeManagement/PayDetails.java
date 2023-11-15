package org.EmployeeManagement;

public class PayDetails {
    private String empId;
    private String empName;
    private double empGrossRemuneration;
    private int daysPresent;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpGrossRemuneration() {
        return empGrossRemuneration;
    }

    public void setEmpGrossRemuneration(double empGrossRemuneration) {
        this.empGrossRemuneration = empGrossRemuneration;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }
}
