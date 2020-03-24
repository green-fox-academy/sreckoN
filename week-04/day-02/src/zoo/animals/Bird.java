package zoo.animals;

public class Bird extends Animal {

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
}
