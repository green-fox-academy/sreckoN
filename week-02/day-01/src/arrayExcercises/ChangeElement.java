package arrayExcercises;

public class ChangeElement {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 8, 5, 6};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 8) numbers[i] = 4;
        }

        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

}
