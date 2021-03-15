package io.rayani.gitsimple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @GetMapping
    public String greeting() {
        return "Hello World";
    }
    @PostMapping
    public String welcome(){
        return "Bye BYe";
    }
}
