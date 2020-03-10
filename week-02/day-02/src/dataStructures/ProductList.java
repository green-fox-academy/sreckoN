package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class ProductList {

    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();

        items.put("Eggs", 200);
        items.put("Milk", 200);
        items.put("Fish", 400);
        items.put("Apples", 150);
        items.put("Bread", 50);
        items.put("Chicken", 550);

        for (String key : items.keySet()) {
            if (items.get(key) < 201) System.out.println(key);
        }

        for (String key : items.keySet()) {
            if (items.get(key) > 150) System.out.println(key + " " + items.get(key));
        }

    }

    public static int howMuchIs(HashMap<String, Integer> items, String item) {
        if (!items.containsKey(item)) return 0;
        return items.get(item);
    }

    public static String mostExpensive(HashMap<String, Integer> items) {
        int max = 0;
        String item = "";
        for (String key : items.keySet()) {
            if (items.get(key) > max) {
                max = items.get(key);
                item = key;
            }
        }
        return item;
    }

    public static double averagePrice(HashMap<String, Integer> items) {
        int sum = 0;
        for (String key : items.keySet()) {
            sum += items.get(key);
        }
        return (double) sum / items.size();
    }

    public static int belowAmount(HashMap<String, Integer> items, int amount) {
        int count = 0;
        for (String key : items.keySet()) {
            if (items.get(key) < amount) count++;
        }
        return count;
    }

    public static boolean costsExactly(HashMap<String, Integer> items, int price) {
        for (String key : items.keySet()) {
            if (items.get(key) == price) return true;
        }
        return false;
    }

    public static String cheapestProduct(HashMap<String, Integer> items) {
        int max = Integer.MAX_VALUE;
        String item = "";
        for (String key : items.keySet()) {
            if (items.get(key) < max) {
                max = items.get(key);
                item = key;
            }
        }
        return item;
    }

}
