package classes.pirates;

import classes.pokemon.Pokemon;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    private Pirate captain;
    private List<Pirate> crew;

    public Ship() {
        this.crew = new ArrayList<>();
    }

    public void fillShip() {
        this.captain = new Pirate();
        int crewNumber = (int) (Math.random() * 30) + 1;
        for (int i = 0; i < crewNumber; i++) {
            crew.add(new Pirate());
        }
    }

    private int numberOfAlive() {
        int counter = 0;
        for (Pirate pirate : this.crew) {
            if (pirate.getState() != Pirate.State.DEAD) {
                counter++;
            }
        }
        return counter;
    }

    public void printShip() {
        if (captain.getState() == Pirate.State.DEAD) {
            System.out.println("Captain is dead! :O");
        } else {
            System.out.println("Captain's state: " + captain.getState() + " Captains rum level: " + captain.getRumLevel());
        }
        System.out.println("Number of alive crew members: " + numberOfAlive());
    }

    public boolean battle(Ship otherShip) {
        // to be continued
        return false;
    }
}
