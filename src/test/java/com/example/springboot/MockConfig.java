package com.example.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.example.springboot.repository.CrudBeerRepository;
import com.example.springboot.service.BeerRepositoryMock;

@Configuration("mockConfig")
@ComponentScan(basePackages = {"com.example.springboot.service", "com.example.springboot.common",
    "com.example.springboot.web", "com.example.springboot.controller"})
@Import(value = AppConfig.class)
@EnableAspectJAutoProxy
public class MockConfig {

  @Bean
  public static CrudBeerRepository beerRepository() {
    return new BeerRepositoryMock();
  }

}
