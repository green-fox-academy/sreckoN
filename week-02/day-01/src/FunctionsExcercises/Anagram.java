package FunctionsExcercises;

import java.util.ArrayList;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("dog",	"god"));

    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        if (word1.equalsIgnoreCase(word2)) return true;

        if (new StringBuilder(word1).reverse().toString().equalsIgnoreCase(word2)) return true;

        String[] combinations = generateCombinations(word1);

        for (String combination : combinations) {
            if (combination.equalsIgnoreCase(word2)) return true;
        }

        return false;
    }

    public static String[] generateCombinations(String str) {
        ArrayList<String> combinationsList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String word = str.charAt(i) + "";
            for (int j = 0; j < str.length(); j++) {
                if (j == i) continue;
                else word += str.charAt(j);
            }
            combinationsList.add(word);
        }

        return combinationsList.stream().toArray(String[]::new);
    }

}
