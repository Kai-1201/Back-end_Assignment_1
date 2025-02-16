package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Laptop laptop() {
        Laptop laptop = new Laptop();
        laptop.setName("Acer");
        return laptop;
    }
}








