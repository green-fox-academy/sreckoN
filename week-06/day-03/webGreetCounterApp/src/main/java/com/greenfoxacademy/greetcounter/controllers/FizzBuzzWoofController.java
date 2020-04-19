package com.greenfoxacademy.greetcounter.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzWoofController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/fizzbuzzcounter")
  public String fizzBuzzCounter(Model model) {
    String three = "Fizz";
    String five = "Buzz";
    String seven = "Woof";
    String word = "";
    int counterInt = (int) counter.get();
    counter.incrementAndGet();

    if (counterInt == 0) {
      word = counterInt + "";
    } else if (counterInt % 105 == 0) {
      word = three + five + seven;
    } else if (counterInt % 35 == 0) {
      word = five + seven;
    } else if (counterInt % 21 == 0) {
      word = three + seven;
    } else if (counterInt % 15 == 0) {
      word = three + five;
    } else if (counterInt % 3 == 0) {
      word = three;
    } else if (counterInt % 5 == 0) {
      word = five;
    } else if (counterInt % 7 == 0) {
      word = seven;
    } else {
      word = counterInt + "";
    }
    model.addAttribute("word", word);

    String font = "";
    if (word.length() == 4) {
      font = "24px";
    } else if (word.length() == 8) {
      font = "48px";
    } else if (word.length() == 12){
      font = "72px";
    } else {
      font = "12px";
    }
    model.addAttribute("font", font);
    return "greeting3";
  }
}
