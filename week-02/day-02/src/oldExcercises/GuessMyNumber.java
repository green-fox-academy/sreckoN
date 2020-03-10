package oldExcercises;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        guessMyNumber();

    }

    public static void guessMyNumber() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int lowLimit = in.nextInt();

        System.out.println("Enter the upper limit: ");
        int upLimit = in.nextInt();

        int magicnumber = lowLimit + (int)(Math.random() * ((upLimit - lowLimit) + 1));

        int lives = 5;

        System.out.println("Start guessing: ");

        while (lives > 0) {
            int guess = in.nextInt();
            if (guess > magicnumber) {
                System.out.print("Too high. ");
                lives--;
                System.out.println("You have " + lives + " lives left.");
            } else if (guess < magicnumber) {
                System.out.print("Too low. ");
                lives--;
                System.out.println("You have " + lives + " lives left.");
            } else {
                break;
            }
        }

        if (lives != 0) System.out.println("You won.");
        else System.out.println("Loooooser.");
    }

}
