package zoo.animals;

public class Mammal extends Animal {

  public Mammal(String name, int age, String latinName, String family, Gender gender) {
    super(name, age, latinName, family, "Mammalia", gender);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }
}
