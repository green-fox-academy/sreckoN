package excercises;

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner in = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            double num = Double.parseDouble(in.nextLine());
            sum += num;
        }

        System.out.println("Sum: " + sum + ", Average: " + (sum / 5));
    }

}
