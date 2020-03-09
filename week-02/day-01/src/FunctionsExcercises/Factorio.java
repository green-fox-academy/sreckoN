package FunctionsExcercises;

public class Factorio {

    public static void main(String[] args) {

        System.out.println(factorio(5));

    }

    public static int factorio(int n) {
        if (n == 0) return 1;
        return n * factorio(n - 1);
    }

}
