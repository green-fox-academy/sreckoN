package extensions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

  int median(List<Integer> pool) {
    if (pool == null || pool.isEmpty()) return -1;
    Collections.sort(pool);
    int median;
    if (pool.size() % 2 == 0)
      median = (pool.get(pool.size()/2) + pool.get(pool.size()/2 - 1))/2;
    else
      median = pool.get(pool.size()/2);
    return median;
  }

  boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarianWord) {
    if (hungarianWord == null || hungarianWord.isEmpty()) return null;
    String word = "";
    for (int i = 0; i < hungarianWord.length(); i++) {
      if (isVowel(hungarianWord.charAt(i))) {
        word += hungarianWord.charAt(i) + "v" + hungarianWord.charAt(i);
      } else {
        word += hungarianWord.charAt(i);
      }
    }
    return word;
  }
}

