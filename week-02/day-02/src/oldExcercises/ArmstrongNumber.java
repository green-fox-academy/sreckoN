package oldExcercises;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(153));

    }

    public static boolean isArmstrongNumber(int number) {
        if (number <= 0) return false;

        int length = (int)(Math.log10(number) + 1);

        int numberCopy = number;
        int sum = 0;

        while (numberCopy > 0) {
            sum += Math.pow((numberCopy % 10), length);
            numberCopy = numberCopy / 10;
        }

        if (sum == number) return true;
        return false;
    }

}
