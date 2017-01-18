package com.example.springboot.repository;

import com.couchbase.client.protocol.views.Query;
import com.example.springboot.domain.Beer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Component;

@Component
public class CouchTemplateBeerRepository implements BeerRepository {

  @Autowired
  private CouchbaseTemplate couchbaseTemplate;

  @Override
  public <S extends Beer> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Beer> Iterable<S> save(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Beer findOne(String id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean exists(String id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterable<Beer> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Iterable<Beer> findAll(Iterable<String> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void delete(String id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void delete(Beer entity) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void delete(Iterable<? extends Beer> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<Beer> all(Query query) {
    // TODO Auto-generated method stub
    return null;
  }

}
