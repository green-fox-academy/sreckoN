package dataStructures;

import java.util.HashMap;

public class ShoppingList2 {

    public static void main(String[] args) {

        HashMap<String, Double> products = new HashMap<>();

        String[] productNames = {"Milk", "Rice", "Eggs", "Cheese", "Chicken Breast", "Apples", "Tomato", "Potato", "Onion"};
        double[] prices = new double[]{1.07, 1.59, 3.14, 12.60, 9.40, 2.31, 2.58, 1.75, 1.10};

        for (int i = 0; i < productNames.length; i++) {
            products.put(productNames[i], prices[i]);
        }

        HashMap<String, Integer> bobsList = new HashMap<>();
        int[] bobsAmount = new int[]{3, 2, 2, 1, 4, 1, 2, 1};

        for (int i = 0; i < productNames.length - 1; i++) {
            bobsList.put(productNames[i], bobsAmount[i]);
        }

        HashMap<String, Integer> alicesList = new HashMap<>();
        String[] alicesProduct = new String[] {"Rice", "Eggs", "Chicken Breasts", "Apples", "Tomato"};
        int[] alicesAmounts = new int[]{1, 5, 2, 1, 10};

        for (int i = 0; i < alicesProduct.length; i++) {
            alicesList.put(alicesProduct[i], alicesAmounts[i]);
        }

        System.out.println("Bob spent: " + spent(products, bobsList));
        System.out.println("Alice spent: " + spent(products, alicesList));

        if (bobsList.get("Rice") > alicesList.get("Rice")) System.out.println("Bob has more rice.");
        else System.out.println("Alice has more rice.");

        int numberOfProductsBob = bobsList.keySet().size();
        int numberOfProductsAlice = alicesList.keySet().size();

        if (numberOfProductsAlice - numberOfProductsBob > 0) System.out.println("Alice has more products.");
        else System.out.println("Bob has more products.");

    }

    public static double spent(HashMap<String, Double> products, HashMap<String, Integer> someonesList) {
        double amount = 0;
        for (String key : someonesList.keySet()) {
            if (products.containsKey(key)) {
                amount += someonesList.get(key) * products.get(key);
            }
        }
        return amount;
    }



}
