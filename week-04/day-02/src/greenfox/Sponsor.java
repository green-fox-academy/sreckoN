package greenfox;

public class Sponsor extends Person implements Cloneable {

  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, Gender gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this("Jane Doe", 30, Gender.FEMALE, "Google");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Sponsor(this.getName(), this.getAge(), this.getGender(), this.company);
  }
}
