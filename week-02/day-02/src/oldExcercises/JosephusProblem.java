package oldExcercises;

import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int numOfPeople = in.nextInt();



    }

    public static int bestPlace(int numOfPeople) {
        if (numOfPeople == 1) return 1;
        int[] people = new int[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            people[i] = 1;
        }

        return 0;
    }

}
