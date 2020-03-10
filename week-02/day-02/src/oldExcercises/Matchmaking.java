package oldExcercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));

    }



    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> merged = new ArrayList<>();
        int shorter;
        int longer;

        if (girls.size() < boys.size()) {
            shorter = girls.size();
            longer = boys.size();
        } else {
            shorter = boys.size();
            longer = girls.size();
        }

        for (int i = 0; i < shorter; i++) {
            merged.add(girls.get(i));
            merged.add(boys.get(i));
        }

        for (int i = shorter; i < longer; i++) {
            merged.add(boys.get(i));
        }

        return merged;
    }

}
