package com.greenfox.todomysql.controller;

import com.greenfox.todomysql.model.Todo;
import com.greenfox.todomysql.repository.ToDoRepository;
import javax.jws.WebParam.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

  @GetMapping("/todo/add")
  public String getAddPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addTodo";
  }

  @PostMapping("/todo/add")
  public String submitNewTodo(@ModelAttribute Todo todo) {
    repository.save(todo);
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    repository.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping("/{id}/edit")
  public String update(@PathVariable long id, Model model) {
    model.addAttribute("todoByID", repository.findById(id).get());
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String updateSubmit(@PathVariable long id, @ModelAttribute Todo todo) {
    repository.save(todo);
    return "redirect:/list";
  }
}
