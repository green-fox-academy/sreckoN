package com.greenfox.webshop.models;

public class Item {

  private String name;
  private String description;
  private double price;
  private int quantityOfStock;

  public Item(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
