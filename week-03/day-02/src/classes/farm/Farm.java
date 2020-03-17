package classes.farm;

import classes.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animals;
    int freeSpace;

    public Farm() {
        this.animals = new ArrayList<>();
        this.freeSpace = 100;
    }

    public void breed() {
        if (freeSpace != 0) {
            Animal newAnimal = new Animal();
            animals.add(newAnimal);
            freeSpace--;
        }
    }

    public void slaughter() {
        int minHunger = Integer.MIN_VALUE;
        Animal leastHungry = null;
        for (Animal animal : this.animals) {
            if (animal.getHunger() > minHunger) {
                minHunger = animal.getHunger();
                leastHungry = animal;
            }
        }
        if (leastHungry != null) animals.remove(leastHungry);
    }
}
