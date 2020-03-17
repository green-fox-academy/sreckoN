package classes.sharpie;

public class Sharpie {

    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount--;
    }

    // For sharpieSet
    public double getInkAmount() {
        return inkAmount;
    }
    public void setInkAmount(double inkAmount) {
        this.inkAmount = inkAmount;
    }
}
