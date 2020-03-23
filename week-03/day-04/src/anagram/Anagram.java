package anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.print.DocFlavor.CHAR_ARRAY;

public class Anagram {

  private boolean isNullOrBlank(String s){
    return s == null || s.isEmpty();
  }

  /*public boolean isAnagram(String word1, String word2) {
    if (isNullOrBlank(word1) || isNullOrBlank(word2)) return false;

    if (word1.length() != word2.length()) return false;

    char[] w1 = word1.toLowerCase().toCharArray();
    char[] w2 = word2.toLowerCase().toCharArray();

    Arrays.sort(w1);
    Arrays.sort(w2);

    for (int i = 0; i < w1.length; i++) {
      if (w1[i] != w2[i]) return false;
    }

    return true;
  }*/
  private Map<Character, Integer> makeCharMap(String word) {
    Map<Character, Integer> charsMap = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      char key = word.charAt(i);
      if (charsMap.containsKey(key)) {
        charsMap.put(key, charsMap.get(key) + 1);
      } else {
        charsMap.put(key, 0);
      }
    }
    return charsMap;
  }

  public boolean isAnagram(String word1, String word2) {
    if (isNullOrBlank(word1) || isNullOrBlank(word2)) return false;

    if (word1.length() != word2.length()) return false;

    Map<Character, Integer> firstWord = makeCharMap(word1);
    Map<Character, Integer> secondWord = makeCharMap(word2);

    for (Character key : firstWord.keySet()) {
      if (!secondWord.containsKey(key)) {
        return false;
      }
      if (firstWord.get(key) != secondWord.get(key)) {
        return false;
      }
    }
    return true;
  }
}
