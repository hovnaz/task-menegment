package com.example.taskmenegment.controller;

import com.example.taskmenegment.entity.User;
import com.example.taskmenegment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String usersPage(ModelMap modelMap){
        List<User> allUsers = userRepository.findAll();
        modelMap.addAttribute("users", allUsers);
        return "users";
    }

}
