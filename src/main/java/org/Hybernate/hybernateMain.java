package org.Hybernate;

public class hybernateMain {
    public static void main(String[] args) {
        Product p= new Product(1,"suppu",45);
        ProductDao productDao = new ProductDao();
        productDao.addProduct(p);
    }
}
