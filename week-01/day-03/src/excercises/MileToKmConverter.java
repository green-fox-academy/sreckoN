package excercises;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the distance: ");
        double distanceM = Double.parseDouble(in.nextLine());
        double distanceK = distanceM * 1.609344;

        System.out.println("Distance in kilometers: " + distanceK);
    }

}
