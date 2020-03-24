package bookingSystem;

import bookingSystem.interfaces.Reservationy;

public class Reservation implements Reservationy {

  private static String[] days = new String[] {"MON", "TUE", "WED", "THU", "FRD", "SAT", "SUN"};
  private String ID;
  private String dOW;

  public Reservation() {
    this.ID = randomID();
    this.dOW = days[(int) (Math.random() * days.length)];
  }

  private String randomID() {
    String id = "";
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    for (int i = 0; i < 8; i++) {
      int index = (int) (Math.random() * chars.length());
      id += chars.charAt(index) + "";
    }
    return id;
  }

  @Override
  public String getDowBooking() {
    return dOW;
  }

  @Override
  public String getCodeBooking() {
    return ID;
  }

  @Override
  public String toString() {
    return "Booking# " + ID + " for " + dOW;
  }
}
