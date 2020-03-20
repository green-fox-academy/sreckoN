package classes.sharpie;

public class SharpieTest {

    public static void main(String[] args) {

        Sharpie pink = new Sharpie("pink", 50);
        Sharpie blue = new Sharpie("blue", 61);

        pink.use();

        System.out.println("After: " + pink.inkAmount);
    }
}
