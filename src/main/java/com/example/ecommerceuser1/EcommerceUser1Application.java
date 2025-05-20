package com.example.ecommerceuser1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceUser1Application {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceUser1Application.class, args);
    }

}
