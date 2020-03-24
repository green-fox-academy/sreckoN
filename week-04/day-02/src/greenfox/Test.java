package greenfox;

import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    Student s1 = new Student("John", 20, Gender.MALE, "BME");
    try {
      Student s2 = (Student) s1.clone();
      s2.introduce();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }


  }

}
