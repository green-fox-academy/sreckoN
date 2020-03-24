package garden;

public class Test {

  public static void main(String[] args) {
    Tree bor = new Tree("green");
    Tree jela = new Tree("dark green");
    Tree tresnja = new Tree("red");

    Flower lala = new Flower("pink");
    Flower narcis = new Flower("yellow");

    Garden garden = new Garden();
    garden.addPlant(bor);
    garden.addPlant(jela);
    garden.addPlant(tresnja);
    garden.addPlant(lala);
    garden.addPlant(narcis);

    garden.printGarden();
    System.out.println();
    garden.water(40);
    garden.printGarden();
    System.out.println();
    garden.water(70);
    garden.printGarden();
  }

}
