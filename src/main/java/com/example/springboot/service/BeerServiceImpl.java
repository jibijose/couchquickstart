package com.example.springboot.service;

import com.example.springboot.domain.Beer;
import com.example.springboot.repository.CouchTemplateBeerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

  @Autowired
  private CouchTemplateBeerRepository beerRepository;

  @Override
  public List<Beer> allBeers() {
    // Beer beer = beerRepository.findOne("abbaye_de_maredsous-8");
    Beer beer = beerRepository.findOne("8");
    return Collections.singletonList(beer);
  }

}
