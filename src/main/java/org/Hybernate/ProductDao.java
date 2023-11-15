package org.Hybernate;
import org.hibernate.Session;

public class ProductDao {
    public void addProduct(Product product) {
        try (Session session = HybernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            System.out.println("Product saved successfully into the database");
        }
    }
}
