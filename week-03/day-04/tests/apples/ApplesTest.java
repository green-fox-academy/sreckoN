package apples;

import static org.junit.jupiter.api.Assertions.*;

import apples.Apples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApplesTest {

  Apples apples;

  @BeforeEach
  void init() {
    apples = new Apples();
  }

 @Test
  void getAppleShouldReturnString() {
    assertTrue(apples.getApple() instanceof String);
  }

  @Test
  void getAppleShouldReturnStringContainingWordApple() {
    assertEquals("apple", apples.getApple());
  }
}