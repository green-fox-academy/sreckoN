package FunctionsExcercises;

import java.util.ArrayList;

public class SubInt {

    public static void main(String[] args) {

        int[] a = subInt(1, new int[] {1, 11, 34, 52, 61});

        for (Integer i : a) {
            System.out.println(i);
        }

    }

    public static int[] subInt(int num, int[] arr) {
        ArrayList<Integer> indexes = new ArrayList<>();
        String numString = num + "";

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i] + "";
            if (s.contains(numString)) indexes.add(i);
        }

        if (indexes.isEmpty()) return (new int[]{});

        int[] indexesArray = new int[indexes.size()];

        for (int i = 0; i < indexes.size(); i++) {
            indexesArray[i] = indexes.get(i);
        }

        return indexesArray;
    }

}
