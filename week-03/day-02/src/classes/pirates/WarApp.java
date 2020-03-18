package classes.pirates;

public class WarApp {

  public static void main(String[] args) {
    Armada pirates = new Armada();
    Armada guard = new Armada();

    pirates.fillWithShips();
    guard.fillWithShips();

    System.out.println(pirates);
    System.out.println(guard);
    System.out.println(pirates.war(guard));
    System.out.println(pirates);
    System.out.println(guard);
  }
}
