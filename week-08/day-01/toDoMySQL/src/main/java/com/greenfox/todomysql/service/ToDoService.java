package com.greenfox.todomysql.service;

import com.greenfox.todomysql.model.Todo;
import com.greenfox.todomysql.repository.ToDoRepository;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  private ToDoRepository repository;
  private AssigneeService assigneeService;

  @Autowired
  public ToDoService(ToDoRepository repository, AssigneeService assigneeService) {
    this.repository = repository;
    this.assigneeService = assigneeService;
  }

  public Iterable<Todo> getTodos() {
    return repository.findAll();
  }

  public List<Todo> getUnfinishedTodos() {
    return repository.findAllByDoneIsFalse();
  }

  public void addTodo(Todo todo) {
    todo.setDate(new Date());
    repository.save(todo);
  }

  public void deleteByID(long id) {
    repository.deleteById(id);
  }

  public void updateToDo(long id) {

  }

  public Optional<Todo> findByID(long id) {
    Optional<Todo> r = repository.findById(id);
    return r;
  }
}
