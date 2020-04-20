package com.greenfox.webshop.controllers;

import com.greenfox.webshop.models.Item;
import com.greenfox.webshop.models.Webshop;
import javax.jws.WebParam.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebshopController {

  private Webshop shop = new Webshop();

  @RequestMapping("/webshop")
  public String home(Model model) {
    model.addAttribute("items", shop.getItems());
    return "index";
  }

  @RequestMapping("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", shop.getAvaiableItems());
    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String cheapest(Model model) {
    shop.sortByPriceAscending();
    model.addAttribute("items", shop.getItems());
    return "index";
  }

  @RequestMapping("/contains-nike")
  public String getNikeItems(Model model) {
    model.addAttribute("items", shop.getNike());
    return "index";
  }

  @RequestMapping("/average-stock")
  public String avgStock(Model model) {
    model.addAttribute("text", "Average stock: " + shop.getAverageStock());
    return "indexWithoutTable";
  }

  @RequestMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    model.addAttribute("text", "Most expensive item: " + shop.getNameOfMostExpensive());
    return "indexWithoutTable";
  }
}
