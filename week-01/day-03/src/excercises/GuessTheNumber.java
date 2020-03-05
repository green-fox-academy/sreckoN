package excercises;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner in = new Scanner(System.in);
        int magicNumber = 22;

        while (true) {
            System.out.println("Enter the number: ");
            int num = Integer.parseInt(in.nextLine());

            if (num == magicNumber) break;
            if (num > magicNumber) System.out.println("The stried number is lower");
            else System.out.println("The stored number is higher");
        }

        System.out.println("You found the number: " + magicNumber);
    }

}
