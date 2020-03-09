package arrayExcercises;

public class Reverse {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};
        int[] reversed = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        for (Integer i : reversed) {
            System.out.println(i);
        }

    }

}
