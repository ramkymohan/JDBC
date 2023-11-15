package org.HybernateExample2;

public class HybernateExampleMain {
    public static void main(String[] args) {
        User user = new User(1,"ramky","ramky","ramky@gamil.com");
        UserDao userDao = new UserDao();
        userDao.addProduct(user);
    }
}
