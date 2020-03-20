package animal;

public class Animal {

  int hunger;
  int thirst;

  public Animal(int hunger, int thirst) {
    if (hunger >= 0 && thirst >= 0) {
      this.hunger = hunger;
      this.thirst = thirst;
    } else {
      this.hunger = 50;
      this.thirst = 50;
    }
  }

  public Animal() {
    this(50, 50);
  }

  public void eat() {
    if (hunger > 0) {
      this.hunger--;
    }
  }

  public void drink() {
    if (thirst > 0) {
      this.thirst--;
    }
  }

  public void play() {
    this.hunger++;
    this.thirst++;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    if (hunger > 0) {
      this.hunger = hunger;
    }
  }

  public int getThirst() {
    return thirst;
  }
}
