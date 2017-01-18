package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.couchbase.client.protocol.views.Query;
import com.example.springboot.domain.Beer;

public interface BeerRepository extends CrudRepository<Beer, String> {

  List<Beer> all(Query query);
  
}
