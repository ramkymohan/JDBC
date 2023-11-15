package org.Hybernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Product {
    @Id
    private int id;
    @Column
    private String pname;
    @Column
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.pname = name;
        this.price = price;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return pname;
    }

    public void setName(String name) {
        this.pname = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

