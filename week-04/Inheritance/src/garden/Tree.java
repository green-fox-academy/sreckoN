package garden;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
  }

  public boolean needsWater() {
    return this.getWaterLevel() < 10;
  }

  public void water(double amount) {
    this.setWaterLevel(amount * 0.4);
  }

  @Override
  public String toString() {
    if (this.needsWater()) {
      return "The " + this.getColor() + " Tree needs water";
    } else {
      return "The " + this.getColor() + " Tree doesn't need water";
    }
  }
}
