package classes.pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

  private List<Ship> ships;

  public Armada() {
    this.ships = new ArrayList<>();
  }

  public void fillWithShips() {
    int shipsNumber = (int) (Math.random() * 50) + 10;
    for (int i = 0; i < shipsNumber; i++) {
      Ship ship = new Ship();
      ship.fillShip();
      this.ships.add(ship);
    }
  }

  public boolean war(Armada otherArmada) {
    int currentShip = 0;
    int currentShipOther = 0;

    while (true) {
      if (this.ships.get(currentShip).battle(otherArmada.ships.get(currentShipOther))) {
        currentShipOther++;
      } else {
        currentShip++;
      }
      if (currentShip == (this.ships.size() - 1)) {
        return false;
      }
      if (currentShipOther == (otherArmada.ships.size() - 1)) {
        return true;
      }
    }
  }


  /*for (int i = 0; i < this.ships.size(); i++) {

      for (int j = 0; j < otherArmada.ships.size(); j++) {
        if (this.ships.get(i).battle(otherArmada.ships.get(j))) {
          continue;
        } else {
          break;
        }
      }

    }*/

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < this.ships.size(); i++) {
      if (i < 9) str += (i + 1) + ".  ship: " + "\t" + this.ships.get(i) + "\n";
      else str += (i + 1) + ". ship: " + "\t" + this.ships.get(i) + "\n";
    }
    return str;
  }
}
