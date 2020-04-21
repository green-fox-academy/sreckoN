package com.greenfox.webshop.models;

public class Item {

  private String name;
  private String description;
  private double price;
  private int quantityOfStock;
  private ItemType type;

  public Item(String name, String description, double price, int quantityOfStock, ItemType type) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
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

  public ItemType getType() {
    return type;
  }
}
