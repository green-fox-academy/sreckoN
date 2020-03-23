package aircraftCarrier;

public class Aircraft {

  private AircraftType type;
  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private boolean isPriority;

  public Aircraft(AircraftType type) {
    if (type == AircraftType.F16) {
      this.maxAmmo = 8;
      this.baseDamage = 30;
      this.isPriority = false;
    }
    if (type == AircraftType.F35) {
      this.maxAmmo = 12;
      this.baseDamage = 50;
      this.isPriority = true;
    }
    this.type = type;
    this.ammo = 0;
  }

  public int getTotalDamage() {
    return baseDamage * ammo;
  }

  public double fight(Aircraft otherAircraft) {
    double damage = getTotalDamage();
    this.ammo = 0;
    return damage;
  }

  public int refill(int amount) {
    if (ammo + amount > maxAmmo) {
      ammo += maxAmmo - ammo;
      return amount - maxAmmo;
    } else {
      ammo += amount;
      return 0;
    }
  }

  public String getType() {
    return this.type + "";
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + (ammo * baseDamage);
  }

  public boolean getPriority() {
    return this.isPriority;
  }

  public int getAmmo() {
    return ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }
}
