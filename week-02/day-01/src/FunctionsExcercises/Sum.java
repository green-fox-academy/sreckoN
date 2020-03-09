package FunctionsExcercises;

public class Sum {

    public static void main(String[] args) {

        System.out.println(sum(5));

    }

    public static int sum(int x) {
        if (x == 0) return 0;
        return x + sum (x - 1);
    }

}
