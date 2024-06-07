package com.example.demosecurity;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@OpenAPIDefinition(info = @Info(
        title = "Spring WebFlux Example",
        version = "1.0",
        description = "Spring WebMvc Example Sample documents"
))
public class DemoSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityApplication.class, args);
    }

}
