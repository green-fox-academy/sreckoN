package dataStructures;

import java.util.ArrayList;

public class List1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Size: " + names.size());

        names.add("William");

        if (names.isEmpty()) System.out.println("It's empty.");
        else System.out.println("It's not empty.");

        names.add("John");
        names.add("Amanda");

        System.out.println("Size: " + names.size());

        System.out.println("Third is " + names.get(2));

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        names.remove(1);

        for (int i = names.size() - 1; i > 0; i--) {
            System.out.println(names.get(i));
        }

        names.clear();
    }

}
