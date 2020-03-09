package arrayExcercises;

public class SumAll {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;

        for (Integer i : numbers) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

    }

}
