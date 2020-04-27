package com.greenfox.todomysql.repository;

import com.greenfox.todomysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo, Long> {

}
