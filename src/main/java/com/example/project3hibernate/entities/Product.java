package com.example.project3hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
//import javax.sound.midi.Instrument;
import static javax.persistence.GenerationType.IDENTITY;



import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "product")
@NamedQueries({

})
public class Product implements Serializable {

    private Long id;
    private String productName;
    private int productPrice;
    private int productQuantity;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return this.id;
    }

    @Column(name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name = "PRODUCT_PRICE")
    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Column(name = "PRODUCT_QUANTITY")
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
