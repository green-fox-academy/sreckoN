package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, String energySource) {
    super(name, energySource, false);
  }

  @Override
  public void land() {
    System.out.println("The helicopter has landed.");
  }

  @Override
  public void fly() {
    System.out.println("The helicopter is flying.");
  }

  @Override
  public void takeOff() {
    System.out.println("The helicopter is taking off.");
  }
}
