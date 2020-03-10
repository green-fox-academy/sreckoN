package FunctionsExcercises;

import java.util.ArrayList;

public class Unique {

    public static void main(String[] args) {

        int[] result = unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});

        for (Integer i : result) {
            System.out.println(i);
        }

    }

    public static int[] unique(int[] arr) {
        int[] uniques = new int[arr.length];
        int counter = 0;

        boolean alreadyIn = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < uniques.length; j++) {
                if (uniques[j] == arr[i]) {
                    alreadyIn = true;
                    break;
                }
            }
            if (alreadyIn) {
                alreadyIn = false;
                continue;
            } else {
                uniques[counter++] = arr[i];
            }
        }

        int[] uniquesWithoutZeros = new int[counter];
        for (int i = 0; i < counter; i++) {
            uniquesWithoutZeros[i] = uniques[i];
        }

        return uniquesWithoutZeros;
    }



/*    public static int[] unique(int[] arr) {
        ArrayList<Integer> uniquesList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniquesList.contains(arr[i])) uniquesList.add(arr[i]);
        }

        if (uniquesList.isEmpty()) return (new int[]{});

        int[] uniqueArray = new int[uniquesList.size()];

        for (int i = 0; i < uniquesList.size(); i++) {
            uniqueArray[i] = uniquesList.get(i);
        }

        return uniqueArray;
    }*/

}
