package com.speaya.library;

import com.speaya.library.entity.User;
import com.speaya.library.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {

		SpringApplication.run(LibraryApplication.class, args );
    }

}
