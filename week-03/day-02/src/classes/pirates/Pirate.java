package classes.pirates;

public class Pirate {

    public enum State {
        PASSED_OUT,
        DEAD,
        ALIVE
    }

    private int rumLevel;
    private boolean intoxicated;
    private State state;

    public Pirate(int rumLevel) {
        this.rumLevel = rumLevel;
        this.state = State.ALIVE;
    }

    public Pirate() {
        this(0);
    }

    public void drinkSomeRum() {
        if (state == State.ALIVE) {
            this.rumLevel++;
        } else {
            System.out.println("he's dead or passed out");
        }
    }

    public void drinkSomeRum(int amount) {
        if (state == State.ALIVE) {
            this.rumLevel += amount;
        } else {
            System.out.println("he's dead or passed out");
        }
    }

    public void howsItGoingMate() {
        if (state == State.DEAD) {
            System.out.println("he's dead");
            return;
        }
        if (rumLevel >= 0 && rumLevel <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.state = State.PASSED_OUT;
        }
    }

    public void die() {
        this.state = State.DEAD;
    }

    public void brawl(Pirate otherPirat) {
        if (otherPirat.state == State.DEAD) {
            return;
        }
        double chance = Math.random();
        if (chance >= 0 && chance <= 0.3) {
            this.die();
        } else if (chance > 0.3 && chance <= 0.6) {
            otherPirat.die();
        } else {
            this.state = State.PASSED_OUT;
            otherPirat.state = State.PASSED_OUT;
        }
    }

    public int getRumLevel() {
        return rumLevel;
    }

    public State getState() {
        return state;
    }
}
