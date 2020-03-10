package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("978-1-60309-452-8", "A Letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");

        for (String key : myMap.keySet()) {
            System.out.println(myMap.get(key) + "(" + key + ")");
        }

        myMap.remove("978-1-60309-444-3");
        myMap.remove("The Lab");

        myMap.put("978-1-60309-450-4", "They Called Us Enemy");
        myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if (myMap.containsKey("478-0-61159-424-8")) System.out.println("It has the key");
        else System.out.println("It doesnt have that key");

        System.out.println(myMap.get("978-1-60309-453-5"));

    }

}
