package zoo.animals;

public abstract class Animal {

  String name;
  int age;
  String latinName;
  String family;
  String animalClass;
  Gender gender;

  public Animal(String name, int age, String latinName, String family, String animalClass, Gender gender) {
    this.name = name;
    this.age = age;
    this.latinName = latinName;
    this.family = family;
    this.animalClass = animalClass;
    this.gender = gender;
  }

  public abstract String getName();
  public abstract String breed();
}
