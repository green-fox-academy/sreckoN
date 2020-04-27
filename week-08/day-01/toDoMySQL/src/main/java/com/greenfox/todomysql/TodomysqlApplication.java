package com.greenfox.todomysql;

import com.greenfox.todomysql.model.Todo;
import com.greenfox.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

  private ToDoRepository repository;

  @Autowired
  public TodomysqlApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Run the run"));
    repository.save(new Todo("Walk the walk"));
    repository.save(new Todo("Talk the talk"));
    repository.save(new Todo("Block the block"));
    repository.save(new Todo("Rock the rock"));
  }
}
