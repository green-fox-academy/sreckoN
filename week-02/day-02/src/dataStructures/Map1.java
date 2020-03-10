package dataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Map1 {

    public static void main(String[] args) {

        Map<Integer, Character> myMap = new HashMap<>();

        if (myMap.isEmpty()) System.out.println("It's empty.");
        else System.out.println("It's not empty.");

        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');

        for (Integer key : myMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Integer key : myMap.keySet()) {
            System.out.print(myMap.get(key) + " ");
        }
        System.out.println();

        myMap.put(68, 'D');

        System.out.println("Number of keys: " + myMap.keySet().size());

        System.out.println(myMap.get(99));

        myMap.remove(97);

        if (myMap.containsKey(100)) System.out.println("There is a value with key 100.");
        else System.out.println("There is no value with key 100.");

        myMap.clear();
    }

}
