package excercises;

import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num = Integer.parseInt(in.nextLine());

        printTopOrBottomLine(num);
        System.out.println();
        for (int i = 0; i < (num - 2); i++) {
            printMiddleLine(num);
            System.out.println();
        }
        printTopOrBottomLine(num);
    }

    public static void printTopOrBottomLine(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("%");
        }
    }

    public static void printMiddleLine(int x) {
        System.out.print("%");
        for (int i = 0; i < (x - 2); i++) {
            System.out.print(" ");
        }
        System.out.print("%");
    }

}
