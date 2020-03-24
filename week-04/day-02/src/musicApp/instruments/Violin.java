package musicApp.instruments;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    super("Violin", numberOfStrings);
  }

  public Violin() {
    this(4);
  }
}
