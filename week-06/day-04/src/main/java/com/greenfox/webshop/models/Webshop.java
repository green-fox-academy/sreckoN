package com.greenfox.webshop.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Webshop {

  private List<Item> items;

  public Webshop() {
    this.items = new ArrayList<>();
  }

  public List<Item> getAvaiableItems() {
    return items.stream().filter(item -> item.getQuantityOfStock() != 0).collect(Collectors.toList());
  }

  public List<Item> getNike() {
    return items.stream().filter(item -> item.getName().toLowerCase().contains("nike")).collect(Collectors.toList());
  }

  public List<Item> sortByPriceAscending() {
    return null;
  }
}
