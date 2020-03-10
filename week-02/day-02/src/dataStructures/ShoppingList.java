package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

    }

    public static boolean isItOnTheList(ArrayList<String> items, String item) {
        return items.contains(item);
    }

}
