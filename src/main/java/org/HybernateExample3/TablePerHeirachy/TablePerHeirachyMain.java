package org.HybernateExample3.TablePerHeirachy;

public class TablePerHeirachyMain {
    public static void main(String[] args) {
        Emplyee emplyee = new Emplyee();
        emplyee.setEmp_name("ramky");
        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setEmp_name("suppu");
        regularEmployee.setSalary(35);
        regularEmployee.setBonus(59);
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setEmp_name("shyam");
        contractEmployee.setContract_period("2Years");
        contractEmployee.setPay_per_hour(29);
        EmployeDao employeDao = new EmployeDao();
        employeDao.addEmployee(emplyee,regularEmployee,contractEmployee);
    }
}
