package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Laptop laptop_1() {
        Laptop laptop_1 = new Laptop();
        laptop_1.setName("Acer");
        return laptop_1;
    }
    @Bean
    public Laptop laptop_2() {
        Laptop laptop_2 = new Laptop();
        laptop_2.setName("Asus");
        return laptop_2;
    }
}








