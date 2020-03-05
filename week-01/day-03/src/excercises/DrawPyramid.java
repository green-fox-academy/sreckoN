package excercises;

import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num = Integer.parseInt(in.nextLine());
        int stars = 1;

        for (int i = 0; i < num; i++) {
            printBlankSpaces(num - i);
            printStar(stars);
            stars += 2;
            System.out.println();
        }
    }

    public static void printBlankSpaces(int num) {
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

}
