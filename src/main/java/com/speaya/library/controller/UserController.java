package com.speaya.library.controller;

import com.speaya.library.entity.User;
import com.speaya.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public long AddUser() {
        User user = new User();
        user.setName("Usman");
        user.setRole("Admin");
        return this.userService.insert(user);
    }
}
