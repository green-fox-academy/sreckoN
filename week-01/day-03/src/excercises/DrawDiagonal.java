package excercises;

import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(in.nextLine());

        int diagonal = 1;

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == (num - 1)) {
                printTopOrBottomLine(num);
                System.out.println();
            } else {
                String line = "";
                for (int j = 0; j < num; j++) {
                    if (j == 0 || j == (num - 1)) {
                        line += "%";
                    } else if (j == diagonal) {
                        line += "%";
                    } else {
                        line += " ";
                    }
                }
                diagonal++;
                System.out.println(line);
            }
        }
        System.out.println();
    }

    public static void printTopOrBottomLine(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("%");
        }
    }

    public static void printLine(int x, int diagonal) {
        String line = "";
        for (int j = 0; j < x; j++) {
            if (j == 0 || j == (x - 1)) {
                line += "%";
            } else if (j == diagonal) {
                line += "%";
                x++;
            } else {
                line += " ";
            }
        }
        System.out.println(line);
    }

}
