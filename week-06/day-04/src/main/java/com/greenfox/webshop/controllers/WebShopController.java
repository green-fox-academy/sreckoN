package com.greenfox.webshop.controllers;

import com.greenfox.webshop.models.Item;
import com.greenfox.webshop.models.ItemType;
import com.greenfox.webshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebShopController {

  private WebShop shop = new WebShop();

  public WebShopController() {
    shop.addItem(new Item("Running shoes", "Nike shoes for running", 120.5, 3, ItemType.CLOTHES_AND_SHOES));
    shop.addItem(new Item("Printer", "Prints pages", 63.25, 12, ItemType.ELECTRONICS));
  }

  @GetMapping("/webshop")
  public String home(Model model) {
    model.addAttribute("items", shop.getItems());
    return "index";
  }

  @GetMapping("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("items", shop.getAvaiableItems());
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapest(Model model) {
    shop.sortByPriceAscending();
    model.addAttribute("items", shop.getItems());
    return "index";
  }

  @GetMapping("/contains-nike")
  public String getNikeItems(Model model) {
    model.addAttribute("items", shop.getNike());
    return "index";
  }

  @GetMapping("/average-stock")
  public String avgStock(Model model) {
    model.addAttribute("text", "Average stock: " + shop.getAverageStock());
    return "indexWithoutTable";
  }

  @GetMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    model.addAttribute("text", "Most expensive item: " + shop.getNameOfMostExpensive());
    return "indexWithoutTable";
  }

  @GetMapping("/search")
  public String searchForm(Model model) {
    model.addAttribute("searchTerm", new String());
    return "index";
  }

  @PostMapping("/search")
  public String searchFormSubmit(@RequestParam(value = "searchTerm", defaultValue = "") String searchTerm, Model model) {
    model.addAttribute("items", shop.search(searchTerm));
    return "index";
  }

  @GetMapping("/more-filters")
  public String filtersPage(Model model) {
    return "filtered";
  }

  @GetMapping("/filter-by-type")
  public String filterByType(Model model) {
    model.addAttribute("type", ItemType.class);
    return "filtered";
  }

  @PostMapping("/filter-by-type")
  public String filterByTypeSubmit(@RequestParam(value = "type", defaultValue = "CLOTHES_AND_SHOES") ItemType type, Model model) {
    model.addAttribute("items", shop.filterByType(type));
    return "filtered";
  }
}
