package excercises;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = Double.parseDouble(in.nextLine());

        System.out.println("Enter the second number: ");
        double num2 = Double.parseDouble(in.nextLine());

        if (num1 > num1) System.out.println(num1);
        else System.out.println(num2);
    }

}
