package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("Apple");
        a.add("Avocado");
        a.add("Blueberries");
        a.add("Durian");
        a.add("Lychee");

        ArrayList<String> b = new ArrayList<>(a);

        if (a.contains("Durian")) System.out.println("a contains 'Durian'");
        else System.out.println("a does not contain 'Durian'");

        b.remove("Durian");

        a.add(3, "Kiwifruit");

        if (a.size() > b.size()) System.out.println("a is bigger");
        else if (b.size() > a.size()) System.out.println("b is bigger");
        else System.out.println("a and b are the same");

        System.out.println("Avocado index: " + a.indexOf("Avocado"));
        System.out.println("Durian index: " + a.indexOf("Durian"));

        a.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        System.out.println(a.get(3));
    }

}
