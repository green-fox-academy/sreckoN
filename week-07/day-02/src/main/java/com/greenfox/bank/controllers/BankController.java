package com.greenfox.bank.controllers;

import com.greenfox.bank.models.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  private List<BankAccount> accounts = new ArrayList<>();

  public BankController() {
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Zazu", 1236, "lion"));
    accounts.add(new BankAccount("Ed", 1291.16, "lion"));
    accounts.add(new BankAccount("Shenzi", 131.3, "lion"));
    accounts.add(new BankAccount("Scar", 2235, "lion"));
  }

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("simba", new BankAccount("Simba", 2000, "lion"));
    return "show";
  }

  @GetMapping("/showtime")
  public String showHtml(Model model) {
    model.addAttribute("tekst", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "show";
  }

  @GetMapping("/shakeouts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "showAccounts";
  }
}
