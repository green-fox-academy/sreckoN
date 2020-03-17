package classes.animal;

public class Animal {

    int hunger;
    int thirst;

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public Animal() {
        this(50, 50);
    }

    public void eat() {
       this.hunger--;
   }

    public void drink() {
       this.thirst--;
   }

    public void play() {
       this.hunger++;
       this.thirst++;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
