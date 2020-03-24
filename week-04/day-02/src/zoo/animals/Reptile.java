package zoo.animals;

public class Reptile extends Animal {

  public Reptile(String name, int age, String latinName, String family, Gender gender) {
    super(name, age, latinName, family, "Reptilia", gender);
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
