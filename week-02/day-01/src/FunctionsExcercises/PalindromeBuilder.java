package FunctionsExcercises;

public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(buildAPalindrome("greenfox"));

    }

    public static String buildAPalindrome(String word) {
        return word.concat(new StringBuilder(word).reverse().toString());
    }

}
