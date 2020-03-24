package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<Aircraft> aircrafts;
  private int storedAmmo;
  private int health;

  public Carrier(int storedAmmo, int health) {
    this.aircrafts = new ArrayList<>();
    this.storedAmmo = storedAmmo;
    this.health = health;
  }

  public void add(Aircraft aircraft) {
    if (aircraft != null) {
      aircrafts.add(aircraft);
    }
  }

  public int countRequiredAmmo() {
    int sum = 0;
    for (Aircraft aircraft : this.aircrafts) {
      sum += aircraft.getMaxAmmo() - aircraft.getAmmo();
    }
    return sum;
  }

  public void fill() {
    if (storedAmmo == 0) throw new RuntimeException("no ammo stored");
    boolean priorityFirst = (countRequiredAmmo() < storedAmmo) ? false : true;
    for (Aircraft aircraft : this.aircrafts) {
      if (priorityFirst && aircraft.getPriority()) {
        storedAmmo = aircraft.refill(storedAmmo);
      }
      if (!priorityFirst) {
        storedAmmo = aircraft.refill(storedAmmo);
      }
    }
  }

  private void takeAPunch(int amount) {
    if (amount > health) {
      health = 0;
    } else {
      health -= amount;
    }
  }

  public void fight(Carrier otherCarrier) {
    otherCarrier.takeAPunch(getTotalDamage());
  }

  private int getTotalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : this.aircrafts) {
      totalDamage += aircraft.getTotalDamage();
    }
    return totalDamage;
  }

  public String getStatus() {
    if (health == 0) {
      return "It's dead Jim :(";
    }
    String status = "HP: " + this.health + ", Aircraft count: " + this.aircrafts.size() + ", Ammo Storage: " + storedAmmo
        + ", Total damage: " + getTotalDamage() + "\n" + "Aircrafts:\n";

    for (int i = 0; i < aircrafts.size(); i++) {
      if (i == aircrafts.size() - 1) {
        status += aircrafts.get(i).getStatus();
      } else {
        status += aircrafts.get(i).getStatus() + "\n";
      }
    }
    return status;
  }
}
