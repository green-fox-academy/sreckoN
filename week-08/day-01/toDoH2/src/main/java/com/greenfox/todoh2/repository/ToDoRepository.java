package com.greenfox.todoh2.repository;

import com.greenfox.todoh2.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo, Long> {

}
