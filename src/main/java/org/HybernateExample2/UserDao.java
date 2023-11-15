package org.HybernateExample2;
import org.hibernate.Session;

public class UserDao {
    public void addProduct(User user) {
        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(user);
            System.out.println("Product saved successfully into the database");
            session.getTransaction().commit();
            session.close();

        }
    }
}
