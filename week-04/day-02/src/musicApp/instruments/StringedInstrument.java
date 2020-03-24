package musicApp.instruments;

public class StringedInstrument extends Instrument {

  int numberOfStrings;

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public String sound() {
    if (name.equals("Electric Guitar")) {
      return "Twang";
    }
    if (name.equals("Bass Guitar")) {
      return "Duum-duum-duum";
    }
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
