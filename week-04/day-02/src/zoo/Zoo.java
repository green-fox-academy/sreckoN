package zoo;

import zoo.animals.Bird;
import zoo.animals.Gender;
import zoo.animals.Mammal;
import zoo.animals.Reptile;

public class Zoo {
  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile", 96, "Crocodilus", " Crocodylidae", Gender.MALE);
    Mammal mammal = new Mammal("Koala", 12, "Phascolarctos cinereus", "Phascolarctidae", Gender.FEMALE);
    Bird bird = new Bird("Parrot", 15, "Psittacus", "Parrots", Gender.FEMALE);

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + ".");
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + ".");
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + ".");
  }
}
