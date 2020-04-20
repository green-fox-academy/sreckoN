package com.greenfox.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebshopController {

  @RequestMapping("/webshop")
  public String home() {
    return "index";
  }
}
