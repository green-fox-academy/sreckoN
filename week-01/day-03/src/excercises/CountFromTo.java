package excercises;

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(in.nextLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(in.nextLine());

        if (num1 > num2) {
            System.out.println("The second number should be bigger");
        } else {
            while (num1 < num2) {
                System.out.println(num1);
                num1++;
            }
        }


    }

}
