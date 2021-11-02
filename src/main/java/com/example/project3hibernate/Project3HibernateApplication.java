package com.example.project3hibernate;

import com.example.project3hibernate.config.SpringConfig;
import com.example.project3hibernate.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class Project3HibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project3HibernateApplication.class, args);
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ProductService productService = ctx.getBean(ProductService.class);
        productService.findAll().forEach(System.out::println);

    }

}
