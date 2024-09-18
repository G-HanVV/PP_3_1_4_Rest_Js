package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.Model.Role;
import ru.kata.spring.boot_security.demo.Model.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImp;

import java.util.List;

@Controller
public class MyController {
    private final UserServiceImp userService;

    @Autowired
    private StringHttpMessageConverter stringHttpMessageConverter;

    @Autowired
    private MyController(UserServiceImp userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}

