package FunctionsExcercises;

import java.util.ArrayList;

public class PalindromeSearcher {

    public static void main(String[] args) {

        String[] results = searchPalindrome("dog goat dad duck doodle never");

        for (String s : results) {
            System.out.println(s);
        }

    }

    private static boolean isPalindrome(String word) {
        if (word.isEmpty()) return false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }

    public static String[] searchPalindrome(String sentence) {
        if (sentence.isEmpty()) return new String[]{};

        ArrayList<String> palindromes = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {

            for (int j = i; j < sentence.length(); j++) {
                String word = sentence.substring(i, j);
                if (isPalindrome(word) && word.length() >= 3) palindromes.add(word);
            }

        }

        return palindromes.stream().toArray(String[]::new);
    }

}
