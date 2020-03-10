package oldExcercises;

import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }

    public static boolean checkNums(ArrayList<Integer> list) {
        int[] elements = new int[]{4, 8, 12, 16};
        for (int i = 0; i < elements.length; i++) {
            if (!list.contains(elements[i])) return false;
        }
        return true;
    }

}
