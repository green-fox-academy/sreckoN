package garden;

public class Plant {

  private String color;
  private double waterLevel;

  public Plant(String color) {
    this.color = color;
    this.waterLevel = 0;
  }

  public boolean needsWater() {
    return this.getWaterLevel() <= 0;
  }

  public void water(double amount) {
    this.setWaterLevel(amount);
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    if (waterLevel > 0) {
      this.waterLevel += waterLevel;
    }
  }

  public String getColor() {
    return color;
  }
}
