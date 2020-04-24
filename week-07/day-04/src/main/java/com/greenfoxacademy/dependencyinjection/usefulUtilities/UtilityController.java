package com.greenfoxacademy.dependencyinjection.usefulUtilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  private UtilityService service;

  @Autowired
  public UtilityController(UtilityService service) {
    this.service = service;
  }

  @GetMapping("/useful")
  public String home() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("randomColor", service.randomColor());
    return "empty";
  }

  @GetMapping("/useful/email")
  public String mail(@RequestParam(value = "email") String email, Model model) {
    System.out.println(email);
    if (email == null || email.isEmpty() || !service.validateEmail(email)) {
      model.addAttribute("message", email + " is not a valid email address");
      model.addAttribute("flag", false);
      model.addAttribute("colorValue", "red");
    } else {
      model.addAttribute("message", email + " is a valid email address");
      model.addAttribute("flag", true);
      model.addAttribute("colorValue", "green");
    }
    return "email";
  }

  @GetMapping("/useful/encode")
  public String encode(@RequestParam(value = "text") String text, @RequestParam(value = "number") String number, Model model) {
    if (number != null && !number.isEmpty() && text != null && !text.isEmpty()) {
      model.addAttribute("result", service.caesar(text, Integer.valueOf(number)));
    } else {
      model.addAttribute("result", text);
    }
    return "caesar";
  }

  @GetMapping("/useful/decode")
  public String decode(@RequestParam(value = "text") String text, @RequestParam(value = "number") String number, Model model) {
    if (number != null && !number.isEmpty() && text != null && !text.isEmpty()) {
      model.addAttribute("result", service.caesar(text, Integer.valueOf(number) * -1));
    } else {
      model.addAttribute("result", text);
    }
    return "caesar";
  }
}
