package com.web.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.web.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "lucas", "lucas@otoni.com", "997744897", "123456");
        return ResponseEntity.ok().body(u);
    }
}
