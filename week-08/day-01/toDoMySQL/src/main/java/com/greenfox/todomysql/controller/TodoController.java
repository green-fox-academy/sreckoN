package com.greenfox.todomysql.controller;

import com.greenfox.todomysql.model.Assignee;
import com.greenfox.todomysql.model.Todo;
import com.greenfox.todomysql.repository.ToDoRepository;
import com.greenfox.todomysql.service.AssigneeService;
import com.greenfox.todomysql.service.ToDoService;
import java.util.GregorianCalendar;
import java.util.Optional;
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

  private ToDoService toDoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodoController(ToDoService toDoService, AssigneeService assigneeService) {
    this.toDoService = toDoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/todo")
  public String home(Model model) {
    model.addAttribute("todos", toDoService.getTodos());
    return "todolist";
  }

  @GetMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false, defaultValue = "false") boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", toDoService.getUnfinishedTodos());
    } else {
      model.addAttribute("todos", toDoService.getTodos());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String getAddPage(Model model) {
    model.addAttribute("todo", new Todo());
    model.addAttribute("dueDate", new String());
    return "addTodo";
  }

  @PostMapping("/todo/add")
  public String submitNewTodo(@ModelAttribute Todo todo) {
    toDoService.addTodo(todo);
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    toDoService.deleteByID(id);
    return "redirect:/list";
  }

  @GetMapping("/{id}/edit")
  public String update(@PathVariable long id, Model model) {
    Optional<Todo> result = toDoService.findByID(id);
    if (result.isPresent()) {
      model.addAttribute("assignees", assigneeService.getAllAssignees());
      //model.addAttribute("newAssignee", new Assignee());
      model.addAttribute("todoByID", result.get());
      model.addAttribute("date", new GregorianCalendar());
    }
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String updateSubmit(@PathVariable long id, @ModelAttribute Todo todo) {
    toDoService.addTodo(todo);
    return "redirect:/list";
  }

  @GetMapping("/assignees")
  public String assignees(Model model) {
    model.addAttribute("assignees", assigneeService.getAllAssignees());
    return "assigneesTodo";
  }

  @GetMapping("/assignees/add")
  public String add(Model model) {
    model.addAttribute("newAssignee", new Assignee());
    return "addAssignee";
  }

  @PostMapping("/assignees/add")
  public String addSubmit(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/assignees";
  }

  @GetMapping("/assignees/{id}/delete")
  public String deleteAssignee(@PathVariable long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/assignees";
  }

  @GetMapping("/assignees/{id}/edit")
  public String editAssignee(@PathVariable long id, Model model) {
    Optional<Assignee> result = assigneeService.findByID(id);
    if (result.isPresent()) {
      model.addAttribute("assigneeToEdit", result.get());
    }
    return "editAssignee";
  }

  @PostMapping("/assignees/{id}/edit")
  public String editAssigneeSubmit(@PathVariable long id, @ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/assignees";
  }
}
