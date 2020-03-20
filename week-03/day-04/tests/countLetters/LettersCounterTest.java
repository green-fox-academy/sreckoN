package countLetters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LettersCounterTest {

  private LettersCounter counter;

  @BeforeEach
  void init() {
    counter = new LettersCounter();
  }

  @Test
  void countLettersReturnsNullIfEmptyStringGiven() {
    assertNull(counter.countLetters(""));
  }

  @Test
  void countLettersReturnsNullIfNullGiven() {
    assertNull(counter.countLetters(null));
  }

  @Test
  void countLettersReturnsHashMap() {
    assertTrue(counter.countLetters("cat") instanceof HashMap);
  }

  @Test
  void countLettersCountsAllTheLetters() {
    String word = "dog";
    assertTrue(counter.countLetters(word).size() == word.length());
  }

  @Test
  void countLettersCountsRight() {
    HashMap<Character, Integer> actual = counter.countLetters("dog");
    for (Character key : actual.keySet()) {
      assertEquals(1, actual.get(key));
    }
  }

  @Test
  void countLettersCountsRight1() {
    HashMap<Character, Integer> actual = counter.countLetters("occurrences");
    HashMap<Character, Integer> expected = new HashMap<>();
    expected.put('o', 1);
    expected.put('c', 3);
    expected.put('u', 1);
    expected.put('r', 2);
    expected.put('e', 2);
    expected.put('n', 1);
    expected.put('s', 1);
    for (Character key : actual.keySet()) {
      assertEquals(expected.get(key), actual.get(key));
    }
  }

  @Test
  void countLettersCountsRight2() {
    HashMap<Character, Integer> actual = counter.countLetters("Create a test.");
    HashMap<Character, Integer> expected = new HashMap<>();
    expected.put('C', 1);
    expected.put('r', 1);
    expected.put('e', 3);
    expected.put('a', 2);
    expected.put('t', 3);
    expected.put(' ', 2);
    expected.put('s', 1);
    expected.put('.', 1);
    for (Character key : actual.keySet()) {
      assertEquals(expected.get(key), actual.get(key));
    }
  }
}