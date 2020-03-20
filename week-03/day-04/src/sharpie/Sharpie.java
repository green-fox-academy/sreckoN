package sharpie;

public class Sharpie {

  private String color;
  private double width;
  private double inkAmount;

  public Sharpie(String color, double width) {
    if (validateConstructorParameters(color, width)) {
      this.color = color;
      this.width = width;
    } else {
      this.color = "Black";
      this.width = 10;
    }
    this.inkAmount = 100;
  }

  private boolean validateConstructorParameters(String color, double width) {
    if (color == null || color.isEmpty()) {
      return false;
    }
    if (width <= 0) {
      return false;
    }
    return true;
  }

  public void use() {
    if (inkAmount > 0) {
      this.inkAmount--;
    }
  }

  // For sharpieSet
  public double getInkAmount() {
    return inkAmount;
  }
  public void setInkAmount(double inkAmount) {
    if (inkAmount >= 0) {
      this.inkAmount = inkAmount;
    }
  }
  public String getColor() {
    return color;
  }
  public double getWidth() {
    return width;
  }
}
