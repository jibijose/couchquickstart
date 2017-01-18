package com.example.springboot.repository;

import com.example.springboot.domain.Beer;

import static com.couchbase.client.java.query.Select.select;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.query.N1qlParams;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.Statement;
import com.couchbase.client.java.query.consistency.ScanConsistency;
import com.couchbase.client.java.query.dsl.Expression;

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
    Statement statement =
        select("meta().id as _ID, meta().cas as _CAS, name, abv, brewery_id, description")
            .from("`beer-sample`").where(Expression.x("name").eq(Expression.s(id)));
    JsonObject parameters = JsonObject.create();
    N1qlQuery n1qlQuery = N1qlQuery.parameterized(statement, parameters,
        N1qlParams.build().consistency(ScanConsistency.STATEMENT_PLUS).adhoc(false));
    Collection<Beer> resultsBeers = couchbaseTemplate.findByN1QL(n1qlQuery, Beer.class);

    return (resultsBeers.size() > 0 ? resultsBeers.iterator().next() : null);
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

}
