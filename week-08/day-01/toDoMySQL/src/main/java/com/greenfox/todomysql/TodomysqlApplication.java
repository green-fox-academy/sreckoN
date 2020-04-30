package com.greenfox.todomysql;

import com.greenfox.todomysql.model.Assignee;
import com.greenfox.todomysql.model.Todo;
import com.greenfox.todomysql.repository.AssigneeRepository;
import com.greenfox.todomysql.repository.ToDoRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

  private ToDoRepository toDoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodomysqlApplication(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
    this.toDoRepository = toDoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Assignee a = new Assignee("Auto", "none");
    assigneeRepository.save(a);
    toDoRepository.save(new Todo("Run the run", a));
    toDoRepository.save(new Todo("Walk the walk", a));
    toDoRepository.save(new Todo("Talk the talk", a));
    toDoRepository.save(new Todo("Block the block", a));
    toDoRepository.save(new Todo("Rock the rock", a));
  }
}
