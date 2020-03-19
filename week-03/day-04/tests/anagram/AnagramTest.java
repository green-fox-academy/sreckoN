package anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

  Anagram anagramChecker;

  @BeforeEach
  void init() {
    anagramChecker = new Anagram();
  }

  @Test
  void isAnagramReturnsFalseIfTheFirstWordIsEmpty() {
    assertFalse(anagramChecker.isAnagram("", "dog"));
  }

  @Test
  void isAnagramReturnsFalseIfTheFirstWordIsNull() {
    assertFalse(anagramChecker.isAnagram("", "dog"));
  }

  @Test
  void isAnagramReturnsFalseIfTheSecondWordIsEmpty() {
    assertFalse(anagramChecker.isAnagram("", "dog"));
  }

  @Test
  void isAnagramReturnsFalseIfTheSecondWordIsNull() {
    assertFalse(anagramChecker.isAnagram("", "dog"));
  }

  @Test
  void isAnagramReturnsFalseIfTheLengthOfTheWordsIsDifferent() {
    assertFalse(anagramChecker.isAnagram("assertion", "dog"));
  }

  @Test
  void isAnagramReturnsFalseWhenLenghtIsSameButNotAnagram() {
    assertFalse(anagramChecker.isAnagram("cat", "dog"));
  }

  @Test
  void isAnagramReturnsTrueIfTwoWordsAreAnagram() {
    assertTrue(anagramChecker.isAnagram("evil", "vile"));
  }

  @Test
  void isAnagramReturnsTrueIfTwoWordsAreAnagram1() {
    assertTrue(anagramChecker.isAnagram("angered", "enraged"));
  }

  @Test
  void isAnagramReturnsTrueIfTwoWordsAreAnagram2() {
    assertTrue(anagramChecker.isAnagram("debit card", "bad credit"));
  }
}