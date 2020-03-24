package greenfox;

public class Mentor extends Person {

  private MentorLevel level;

  public Mentor(String name, int age, Gender gender, MentorLevel level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this("Jane Doe", 30, Gender.FEMALE, MentorLevel.INTERMEDIATE);
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " " + this.level + " mentor.");
  }

}
