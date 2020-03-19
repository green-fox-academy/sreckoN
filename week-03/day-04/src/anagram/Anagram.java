package anagram;

import java.util.Arrays;

public class Anagram {

  public boolean isAnagram(String word1, String word2) {
    if (word1 == null || word1.isEmpty() || word2 == null || word2.isEmpty()) return false;
    if (word1.length() != word2.length()) return false;

    char[] w1 = word1.toLowerCase().toCharArray();
    char[] w2 = word2.toLowerCase().toCharArray();

    Arrays.sort(w1);
    Arrays.sort(w2);

    for (int i = 0; i < w1.length; i++) {
      if (w1[i] != w2[i]) return false;
    }

    return true;
  }
}
