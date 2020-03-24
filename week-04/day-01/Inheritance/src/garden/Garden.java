package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    if (plant != null) {
      plants.add(plant);
    }
  }

  private int countThoseThatNeedWater() {
    int count = 0;
    for (Plant plant : plants) {
      if (plant.needsWater()) {
        count++;
      }
    }
    return count;
  }

  public void water(int amount) {
    System.out.println("Watering with " + amount);
    double perPlant = amount / countThoseThatNeedWater();
    for (Plant plant : plants) {
      plant.water(perPlant);
    }
  }

  public void printGarden() {
    for (Plant plant : plants) {
      System.out.println(plant);
    }
  }
}
