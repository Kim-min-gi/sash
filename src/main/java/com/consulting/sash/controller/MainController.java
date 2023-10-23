package com.consulting.sash.controller;


import com.consulting.sash.request.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    //SSR -> jsp, thymeleaf, mustache, freemarker
    // html rendering
    //SPA -> vue -> vue + SSR = nuxt
    //       react -> react + SSR = next.js
    // javascript + < - > API (JSON)

    //Http Method
    // Get, Post , Put , Patch, Delete , Options, Head, Trace , connect

    @GetMapping("/")
    public String get(){
        return "Test Mapping";
    }


    @PostMapping ("/post")
    public String login(@RequestBody UserDTO params){
        return "Test Mapping";
    }

}
