package com.greenfox.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

  private List<Item> items;

  public WebShop() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    if (item != null) {
      items.add(item);
    }
  }

  public List<Item> getAvaiableItems() {
    return items.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
  }

  public List<Item> getNike() {
    return items.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike") || item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }

  public void sortByPriceAscending() {
    items = items.stream()
        .sorted(Comparator.comparing(p -> Double.valueOf(p.getPrice())))
        .collect(Collectors.toList());
  }

  public double getAverageStock() {
    int sum = items.stream().mapToInt(s -> s.getQuantityOfStock()).sum();
    return (double) sum / items.size();
  }

  public String getNameOfMostExpensive() {
    return items.stream()
        .reduce((i1, i2) -> i1.getPrice() > i2.getPrice() ? i1 : i2)
        .get()
        .getName();
  }

  public List<Item> search(String term) {
    return items.stream()
        .filter(item -> item.getName().toLowerCase().contains(term) || item.getDescription().toLowerCase().contains(term))
        .collect(Collectors.toList());
  }

  public List<Item> filterByType(ItemType type) {
    return items.stream()
        .filter(item -> item.getType() == type).collect(Collectors.toList());
  }

  public List<Item> getItems() {
    return items;
  }
}
