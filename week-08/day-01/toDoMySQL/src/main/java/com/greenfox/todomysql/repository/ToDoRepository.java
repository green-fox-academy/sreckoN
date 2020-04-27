package com.greenfox.todomysql.repository;

import com.greenfox.todomysql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByDoneIsFalse();
}
