package org.HybernateExample3.TablePerConcrete;



public class TablePerConcrete {
    public static void main(String[] args) {
        EmployeePerConcret employeePerConcret = new EmployeePerConcret();
        employeePerConcret.setEmp_name("ramky");
        RegularEmployeePerConcrete regularEmployeePerConcrete = new RegularEmployeePerConcrete();
        regularEmployeePerConcrete.setEmp_name("suppu");
        regularEmployeePerConcrete.setSalary(35);
        regularEmployeePerConcrete.setBonus(59);
        ContractEmployeePerConcrete contractEmployeePerConcrete = new ContractEmployeePerConcrete();
        contractEmployeePerConcrete.setEmp_name("shyam");
        contractEmployeePerConcrete.setContract_period("2Years");
        contractEmployeePerConcrete.setPay_per_hour(29);
        EmployeDao employeDao = new EmployeDao();
        employeDao.addEmployee(employeePerConcret, regularEmployeePerConcrete, contractEmployeePerConcrete);
    }
}
