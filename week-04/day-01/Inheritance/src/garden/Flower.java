package garden;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
  }

  public boolean needsWater() {
    return this.getWaterLevel() < 5;
  }

  public void water(double amount) {
    this.setWaterLevel(amount * 0.75);
  }

  @Override
  public String toString() {
    if (this.needsWater()) {
      return "The " + this.getColor() + " Flower needs water";
    } else {
      return "The " + this.getColor() + " Flower doesnt need water";
    }
  }
}
