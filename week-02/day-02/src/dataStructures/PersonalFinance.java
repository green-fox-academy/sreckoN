package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {

    public static void main(String[] args) {

        ArrayList<Integer> expenses = new ArrayList<>();

        expenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        System.out.println(averageSpending(expenses));

    }

    public static int spendings(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public static int greatestExpense(ArrayList<Integer> list) {
        int max = 0;
        for (Integer i : list) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int cheapestSpending(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i < min) min = i;
        }
        return min;
    }

    public static double averageSpending(ArrayList<Integer> list) {
        int max = 0;
        for (Integer i : list) {
            if (i > max) max = i;
        }
        return (double) max / list.size();
    }

}
