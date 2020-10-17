package com.eshop.e_commerece.controller;


import com.eshop.e_commerece.model.Users;
import com.eshop.e_commerece.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping(value ="/")
    public List<Users> getUsers(@RequestBody Users users){
        return usersService.getAll(users);
    }

    @GetMapping("/{id}")
    Users getUser(@PathVariable Long id) {
        return usersService.getById(id);
    }

    @PostMapping(value ="/")
    public Users newUser(@RequestBody Users users){
        return usersService.saveUsers(users);
    }


    @PutMapping("/{id}")
    void updateUser(@PathVariable Long id, @RequestBody Users users) throws Exception {
        usersService.update(id, users);
    }

    @DeleteMapping("/{id}")
    void updateUser(@PathVariable Long id) {
        usersService.delete(id);
    }

}
