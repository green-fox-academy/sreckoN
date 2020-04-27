package com.greenfox.programmerclub.models;

import java.util.List;

public class Fox {

  private String name;
  private List<Trick> tricks;
  private Food food;
  private Drink drinks;

  public Fox(String name, Food food, Drink drinks) {
    this.name = name;
    this.food = food;
    this.drinks = drinks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public Drink getDrinks() {
    return drinks;
  }

  public void setDrinks(Drink drinks) {
    this.drinks = drinks;
  }
}
