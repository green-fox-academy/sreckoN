package extensions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void addReturnsRightResult() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void addReturnsRightResult1() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void maxOfThreeReturnsRightResult() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void maxOfThreeReturnsRightResult1() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void medianReturnsMinusOneIfGivenNull() {
    assertEquals(-1, extension.median(null));
  }

  @Test
  void medianReturnsMinusOneIfGivenEmptyList() {
    assertEquals(-1, extension.median(null));
  }

  @Test
  void medianReturnsRightResult() {
    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void medianReturnsRightResult1() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void isVowelReturnsTrueWithRightInput() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void isVowelReturnsTrueWithRightInput1() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void isVowelReturnsFalseWithWrongInput1() {
    assertFalse(extension.isVowel('z'));
  }

  @Test
  void translateReturnsNullWhenNullStringGiven() {
    assertNull(extension.translate(null));
  }

  @Test
  void translateReturnsNullWhenEmptyStringGiven() {
    assertNull(extension.translate(null));
  }

  @Test
  void translateReturnsRightResult() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void translateReturnsRightResult1() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}