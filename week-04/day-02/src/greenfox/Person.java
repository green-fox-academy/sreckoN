package greenfox;

import com.sun.org.apache.xpath.internal.operations.And;

public class Person implements Cloneable {

  private String name;
  private int age;
  Gender gender;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this("Jane Doe", 30, Gender.FEMALE);
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }
}
