package com.greenfoxacademy.dependencyinjection.gfa;

import javax.jws.WebParam.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GFAController {

  private StudentService service;

  @Autowired
  public GFAController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/gfa")
  public String home(Model model) {
    model.addAttribute("count", service.count());
    return "gfa_index";
  }

  @GetMapping("/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("students", service.findAll());
    return "gfa_list";
  }

  @GetMapping("/gfa/add")
  public String add() {
    return "gfa_add";
  }

  @PostMapping("/gfa/save")
  public String addStudent(String name, Model model) {
    service.save(name);
    model.addAttribute("students", service.findAll());
    return "gfa_list";
  }

  @GetMapping("/gfa/check")
  public String checkStudent() {
    return "gfa_check";
  }

  @PostMapping("/gfa/check")
  public String checkStudentSubmit(String name, Model model) {
    if (service.check(name)) {
      model.addAttribute("presence", true);
    } else {
      model.addAttribute("presence", false);
      model.addAttribute("run", true);
    }
    return "gfa_check";
  }
}
