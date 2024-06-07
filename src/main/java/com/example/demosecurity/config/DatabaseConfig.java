package com.example.demosecurity.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"com.example.demosecurity.model"})
@EnableJpaRepositories(basePackages = {"com.example.demosecurity.repository"})
@ComponentScan(basePackages = {"com.example.demosecurity.controller", "com.example.demosecurity.service"})
public class DatabaseConfig {

}
