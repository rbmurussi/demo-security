package com.example.demosecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    private final SecurityContextHolderStrategy securityContextHolderStrategy =
            SecurityContextHolder.getContextHolderStrategy();

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hi")
    public String hi() {
        Authentication authentication = this.securityContextHolderStrategy.getContext().getAuthentication();
        String name = authentication.getName();
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/me", produces = "application/json")
    public Authentication me() {
        return this.securityContextHolderStrategy.getContext().getAuthentication();
    }

}
