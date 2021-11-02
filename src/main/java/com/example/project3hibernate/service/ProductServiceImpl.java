package com.example.project3hibernate.service;

import com.example.project3hibernate.entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("productService")

public class ProductServiceImpl implements ProductService{

    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        //return sessionFactory.getCurrentSession().createQuery("from Singer s").list();
        return sessionFactory.getCurrentSession().createQuery("from Product s").list();

    }

}
