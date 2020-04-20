package com.greenfox.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Webshop {

  private List<Item> items;

  public Webshop() {
    this.items = new ArrayList<>();
  }

  public List<Item> getAvaiableItems() {
    return items.stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
  }

  public List<Item> getNike() {
    return items.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }

  public void sortByPriceAscending() {
    items.stream()
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
}
