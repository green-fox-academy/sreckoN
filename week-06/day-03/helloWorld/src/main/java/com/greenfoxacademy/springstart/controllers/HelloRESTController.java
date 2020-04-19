package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.domain.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), "Hello " + name + "!");
  }
}
