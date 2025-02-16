package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Laptop laptop_1 = context.getBean("laptop_1", Laptop.class);
        Laptop laptop_2 = context.getBean("laptop_2", Laptop.class);
        System.out.println(laptop_1.getName());
        System.out.println(laptop_2.getName());
    }
}