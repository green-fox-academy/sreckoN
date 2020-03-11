package exceptions;

public class DivideByZero {

    public static void main(String[] args) {

        System.out.println(devideTen(0));

    }

    public static double devideTen(int number) {
        double result = 0;
        try {
            result = 10 / number;
        } catch (Exception e) {
            System.out.println("Fail.");
        }
        return result;
    }
}
