package bookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Reservation> reservations = new ArrayList<>();

    reservations.add(new Reservation());
    reservations.add(new Reservation());
    reservations.add(new Reservation());

    for (Reservation reservation : reservations) {
      System.out.println(reservation);
    }
  }
}
