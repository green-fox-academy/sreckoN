package musicApp.instruments;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super("Electric Guitar", numberOfStrings);
  }

  public ElectricGuitar() {
    this(6);
  }
}
