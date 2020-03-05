package excercises;

import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(in.nextLine());

        int counter = num;
        while (counter > 0) {
            System.out.println("Enter the number: ");
            int numToSum = Integer.parseInt(in.nextLine());
            sum += numToSum;
            counter--;
        }

        System.out.println("Sum: " + sum + ", Average: " + (double) sum / num);
    }

}
