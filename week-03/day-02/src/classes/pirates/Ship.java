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

    private double calculateShipScore() {
        return numberOfAlive() - this.captain.getRumLevel();
    }

    private void randomDeaths() {
        int numberOfDeaths = (int) (1 + (Math.random()) * this.crew.size());
        for (int i = 0; i < numberOfDeaths; i++) {
            int toDie = (int) ((Math.random()) * this.crew.size());
            crew.remove(toDie);
        }
    }

    private void rumParty() {
        int rumLevel = (int) (Math.random() * 50);
        this.captain.drinkSomeRum(rumLevel);
        for (int i = 0; i < crew.size(); i++) {
            rumLevel = (int) (Math.random() * 50);
            this.crew.get(i).drinkSomeRum(rumLevel);
        }
    }

    public boolean battle(Ship otherShip) {
        if (this.calculateShipScore() > otherShip.calculateShipScore()) {
            otherShip.randomDeaths();
            this.rumParty();
            return true;
        } else {
            this.randomDeaths();
            otherShip.rumParty();
            return false;
        }
    }

    @Override
    public String toString() {
        return "Captain: " + this.captain.getState() + "\tAlive crew: " + numberOfAlive();
    }
}
