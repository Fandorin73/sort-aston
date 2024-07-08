package ru.aston.springtest.springdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Точка входа.
 *
 * @author Andrey
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User API", version = "2.0", description = "Employees Information"))
public class SpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
