package classes.pirates;

public class BattleApp {

  public static void main(String[] args) {
    Ship blackPearl = new Ship();
    Ship titanic = new Ship();

    blackPearl.fillShip();
    titanic.fillShip();

    System.out.println("Black Pearl: ");
    blackPearl.printShip();
    System.out.println("Titanic");
    titanic.printShip();
    System.out.println(blackPearl.battle(titanic));
    System.out.println("Black Pearl: ");
    blackPearl.printShip();
    System.out.println("Titanic");
    titanic.printShip();
  }
}
