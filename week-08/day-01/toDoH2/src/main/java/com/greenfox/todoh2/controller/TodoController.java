package com.greenfox.todoh2.controller;

import com.greenfox.todoh2.model.Todo;
import com.greenfox.todoh2.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  private ToDoRepository repository;

  @Autowired
  public TodoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/todo")
  public String home() {
    return "index";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
}
