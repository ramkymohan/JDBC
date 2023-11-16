package org.HybernateExample3.TablePerConcrete;

import org.hibernate.Session;

public class EmployeDao {

    public void addEmployee(EmployeePerConcret employeePerConcret, RegularEmployeePerConcrete regularEmployeePerConcrete, ContractEmployeePerConcrete contractEmployeePerConcrete) {
        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(employeePerConcret);
            session.save(regularEmployeePerConcrete);
            session.save(contractEmployeePerConcrete);
            session.getTransaction().commit();
            System.out.println("Product saved successfully into the database");
            session.close();
        }
    }
}
