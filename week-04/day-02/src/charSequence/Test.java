package charSequence;

public class Test {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("Do you see blue people?");
    System.out.println(g.length());

    Shifter s = new Shifter("Srecko", 2);
    System.out.println(s.subSequence(0, 3));
  }
}
