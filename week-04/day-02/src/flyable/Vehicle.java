package flyable;

public abstract class Vehicle {
  String name;
  String energySource;
  boolean landVehhicle;

  public Vehicle(String name, String energySource, boolean landVehhicle) {
    this.name = name;
    this.energySource = energySource;
    this.landVehhicle = landVehhicle;
  }
}
