package excercises;

import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {
        //Assuming input is odd
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num = Integer.parseInt(in.nextLine());

        int stars = 1;
        int spaces;
        if (num % 2 == 0) spaces = num / 2;
        else spaces = (num / 2) + 1;

        for (int i = 0; i < num; i++) {
            if (i > (num / 2)) {
                spaces++;
                printBlankSpaces(spaces);
                stars -= 2;
                printStar(stars);
                System.out.println();
            } else if (i == ((num / 2))) {
                printBlankSpaces(1);
                printStar(num);
                System.out.println();
            } else {
                printBlankSpaces(spaces);
                spaces--;
                printStar(stars);
                stars += 2;
                System.out.println();
            }
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
