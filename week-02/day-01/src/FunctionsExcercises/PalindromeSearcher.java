package FunctionsExcercises;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {

    public static void main(String[] args) {

        List<String> results = searchPalindrome("dog goat dad duck doodle never");

        for (String s : results) {
            System.out.println(s);
        }

    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }

    public static List<String> searchPalindrome(String sentence) {
        if (sentence.isEmpty()) return new ArrayList<>();

        List<String> palindromes = new ArrayList<>();

        for (int i = sentence.length() - 2; i > 0; i--) {

            for (int j = i + 2; j < sentence.length(); j++) {
                palindromes.add(sentence.substring(i, j));
                //if (isPalindrome(word) && word.length() >= 3) palindromes.add(word);
            }

        }

        return palindromes;
    }

}
