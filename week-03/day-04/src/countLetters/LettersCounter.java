package countLetters;

import java.util.HashMap;
import java.util.Map;

public class LettersCounter {

  public HashMap<Character, Integer> countLetters(String str) {
    if (str == null || str.isEmpty()) return null;

    HashMap<Character, Integer> letterCounter = new HashMap<>();
    for (Character character : str.toCharArray()) {
      if (letterCounter.containsKey(character)) letterCounter.put(character, letterCounter.get(character) + 1);
      else letterCounter.put(character, 1);
    }
    return letterCounter;
  }
}
