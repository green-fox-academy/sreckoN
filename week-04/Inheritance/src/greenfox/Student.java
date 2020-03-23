package greenfox;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, Gender gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this("Jane Doe", 30, Gender.FEMALE, "The School of Life");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    if (numberOfDays > 0) {
      this.skippedDays += numberOfDays;
    }
  }

}
