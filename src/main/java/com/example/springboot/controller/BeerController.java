package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BeerController {

  @RequestMapping("/hello")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}