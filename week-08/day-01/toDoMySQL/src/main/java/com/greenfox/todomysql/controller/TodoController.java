package com.greenfox.todomysql.controller;

import com.greenfox.todomysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private ToDoRepository repository;

  @Autowired
  public TodoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/todo")
  public String home(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }

  @GetMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false, defaultValue = "false") boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", repository.findAllByDoneIsFalse());
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "todolist";
  }


}
