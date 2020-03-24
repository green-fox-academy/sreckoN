package zoo.animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name, int age, String latinName, String family, Gender gender) {
    super(name, age, latinName, family, "Aves", gender);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void land() {
    System.out.println("The bird has landed.");
  }

  @Override
  public void fly() {
    System.out.println("The bird is flying.");
  }

  @Override
  public void takeOff() {
    System.out.println("The bird is taking off.");
  }
}
