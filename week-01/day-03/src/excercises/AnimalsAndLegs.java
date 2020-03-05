package excercises;

import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner in = new Scanner(System.in);

        System.out.println("How many chickens do you have?");
        int chickens = Integer.parseInt(in.nextLine());

        System.out.println("How many pigs do you have?");
        int pigs = Integer.parseInt(in.nextLine());

        System.out.println("Number of legs: " + (chickens * 2 + pigs * 4));
    }

}
