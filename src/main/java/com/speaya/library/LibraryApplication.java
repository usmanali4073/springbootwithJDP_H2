package com.speaya.library;

import com.speaya.library.entity.User;
import com.speaya.library.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.speaya.library.repository")
@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {

		SpringApplication.run(LibraryApplication.class, args );
    }

}
