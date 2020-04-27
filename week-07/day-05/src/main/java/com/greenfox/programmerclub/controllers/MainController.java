package com.greenfox.programmerclub.controllers;

import com.greenfox.programmerclub.models.Drink;
import com.greenfox.programmerclub.models.Food;
import com.greenfox.programmerclub.models.Fox;
import com.greenfox.programmerclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String home(@RequestParam(name = "name", required = false) String name) {
    return "index";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String loginSubmit(String name) {
    if (name == null || name.isEmpty()) {
      return "redirect:/";
    }
    if (!foxService.isFoxAlreadyIn(name)) {
      foxService.addFox(new Fox(name, new Food("meat"), new Drink("water")));
      return "redirect:/?name=" + name;
    }
    return "login";
  }
}
