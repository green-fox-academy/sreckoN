package com.greenfox.todoh2;

import com.greenfox.todoh2.model.Todo;
import com.greenfox.todoh2.repository.ToDoRepository;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

  private ToDoRepository repository;

  @Autowired
  public Todoh2Application(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Todoh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Plant a plant", false, true));
    repository.save(new Todo("Walk a walk", true, false));
  }
}
