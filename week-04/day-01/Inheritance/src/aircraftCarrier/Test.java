package aircraftCarrier;

public class Test {

  public static void main(String[] args) {
    Aircraft a = new Aircraft(AircraftType.F35);
    Aircraft b = new Aircraft(AircraftType.F16);
    Aircraft c = new Aircraft(AircraftType.F35);
    Aircraft d = new Aircraft(AircraftType.F16);

    Carrier carrier = new Carrier(200, 1000);

    carrier.add(a);
    carrier.add(b);
    carrier.add(c);
    carrier.add(d);

    System.out.println(carrier.getStatus());
    System.out.println("*******");

    carrier.fill();

    System.out.println(carrier.getStatus());
    System.out.println("*******");

    Carrier carrier1 = new Carrier(10, 0);
    System.out.println(carrier1.getStatus());
  }
}
