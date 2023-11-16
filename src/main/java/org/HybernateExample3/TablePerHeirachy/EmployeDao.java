package org.HybernateExample3.TablePerHeirachy;

import org.hibernate.Session;

public class EmployeDao {

    public void addEmployee(Emplyee emplyee, RegularEmployee regularEmployee, ContractEmployee contractEmployee) {
        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(emplyee);
            session.save(regularEmployee);
            session.save(contractEmployee);
            session.getTransaction().commit();
            System.out.println("Product saved successfully into the database");
            session.close();
        }
    }
}
