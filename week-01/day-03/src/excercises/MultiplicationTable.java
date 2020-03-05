package excercises;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(in.nextLine());

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }

}
