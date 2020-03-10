package oldExcercises;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int numOfPeople = in.nextInt();

        System.out.println(bestPlace(numOfPeople));

    }

    public static int bestPlace(int numOfPeople) {
        if (numOfPeople == 1) return 1;

        ArrayList<Integer> people = makeList(numOfPeople);

        int start = -1;
        while (people.size() != 1) {
            if (people.size() == numOfPeople) {
                start = kill(people, 0);
                continue;
            } else {
                start = kill(people, start);
            }
        }

        return people.get(0);
    }

    private static ArrayList<Integer> makeList(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            list.add(i);
        }
        return list;
    }

    private static int kill(ArrayList<Integer> people, int whoKills) {
        int toKill = -1;
        if (whoKills == 0) {
            for (int i = 0; i < people.size(); i++) {
                if (i % 2 != 0) people.set(i, -1);
            }
        } else {
            for (int i = 0; i < people.size(); i++) {
                if (i % 2 == 0) people.set(i, -1);
            }
        }

        if (people.get(people.size() - 1) == -1) toKill = 0;
        else toKill = people.size() - 1;

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) == -1) people.remove(i);
        }

        return toKill;
    }

}
