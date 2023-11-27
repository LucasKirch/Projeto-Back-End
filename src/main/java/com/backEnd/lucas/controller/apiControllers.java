package com.backEnd.lucas.controller;

import com.backEnd.lucas.models.User;
import com.backEnd.lucas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class apiControllers {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public String getPage(){

        return "<h1>Bem vindo a API BackEnd - Projeto Java: Lucas Kirchesch / Luciano Lira</h1>";

    }

    @GetMapping(value = "/usuarios")
    public List<User> obterUsuarios(){
        return userRepository.findAll();
    }

}
