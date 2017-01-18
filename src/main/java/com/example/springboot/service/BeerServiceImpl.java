package com.example.springboot.service;

import com.example.springboot.domain.Beer;
import com.example.springboot.repository.CouchTemplateBeerRepository;
import com.example.springboot.repository.CrudBeerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

//  @Autowired
//  private CrudBeerRepository beerRepository;
  
  @Autowired
  private CouchTemplateBeerRepository beerRepository;

  @Override
  public List<Beer> allBeers() {
    Beer beer = beerRepository.findOne("abbaye_de_maredsous-8");
    return Collections.singletonList(beer);
  }

}
