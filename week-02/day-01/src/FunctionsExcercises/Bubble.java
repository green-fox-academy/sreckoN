package FunctionsExcercises;

public class Bubble {

    public static void main(String[] args) {

        int[] x = {34, 12, 24, 9, 5};

        int[] y = advancedBubble(x, true);

        for (Integer i : y) {
            System.out.println(i);
        }

    }

    public static int[] bubble(int[] array) {
        if (array.length == 0) return null;

        boolean swapped = false;

        while (!swapped) {
            swapped = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = false;
                }
            }
        }

        return array;
    }

    private static int[] reverseArray(int[] array) {
        int[] desc = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            desc[i] = array[array.length - 1 - i];
        }
        return  desc;
    }

    public static int[] advancedBubble(int[] array, boolean descending) {
       array = bubble(array);
       if (descending) return reverseArray(array);
       else return array;
    }

}
