package com.wwc.jpa_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.wwc.jpa_crud.domain")
@EnableJpaRepositories("com.wwc.jpa_crud.jpa")
@SpringBootApplication
public class JpaCrudApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JpaCrudApplication.class, args);
    }

}
