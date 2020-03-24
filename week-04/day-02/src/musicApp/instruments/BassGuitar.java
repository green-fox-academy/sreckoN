package musicApp.instruments;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    super("Bass Guitar", numberOfStrings);
  }

  public BassGuitar() {
    this(4);
  }
}
