package com.greenfox.programmerclub.services;

import com.greenfox.programmerclub.models.Drink;
import com.greenfox.programmerclub.models.Food;
import com.greenfox.programmerclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    this.foxes = new ArrayList<>();
    foxes.add(new Fox("Arctic fox", new Food("Grass"), new Drink("Water")));
    foxes.add(new Fox("Swift fox", new Food("Grass"), new Drink("Water")));
    foxes.add(new Fox("Pale fox", new Food("Grass"), new Drink("Water")));
  }

  public void addFox(Fox fox) {
    if (fox != null) {
      foxes.add(fox);
    }
  }

  public boolean isFoxAlreadyIn(String name) {
    return foxes.contains(name);
  }

  public Fox getFoxByName(String name) {
    if (!isFoxAlreadyIn(name)) {
      return null;
    }
    return foxes.get(foxes.indexOf(name));
  }
}
