package com.todolist.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {
    @GetMapping
    public String getTask() {
        return "cool";
    }
}
