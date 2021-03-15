package io.rayani.gitsimple.controller;

import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping
    public void delete(){
        System.out.println("lying");
    }
    @PutMapping
    public void update(){
        if (true){
            //TODO something
        }
        System.out.println("Hello World");
    }
}
