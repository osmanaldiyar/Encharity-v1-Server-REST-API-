package com.encharity.encharity_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class EncharityBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncharityBackendApplication.class, args);
    }
}
