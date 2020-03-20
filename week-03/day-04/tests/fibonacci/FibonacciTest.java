package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {

  private Fibonacci f;

  @BeforeEach
  void init() {
    f = new Fibonacci();
  }

  @Test
  void getElementAtIndexReturnsOneWhenGivenOne() {
    assertEquals(1, f.getElementAtIndex(1));
  }

  @Test
  void getElementAtIndexReturnsOneWhenGivenTwo() {
    assertEquals(1, f.getElementAtIndex(2));
  }

  @Test
  void getElementAtIndexReturnsZeroIfNegativeNumberGiven() {
    assertEquals(0, f.getElementAtIndex(-9));
  }

  @Test
  void getElementAtIndexReturnsRightNumber() {
    assertEquals(5, f.getElementAtIndex(5));
  }

  @Test
  void getElementAtIndexReturnsRightNumber1() {
    assertEquals(55, f.getElementAtIndex(10));
  }

  @Test
  void getElementAtIndexReturnsRightNumber2() {
    assertEquals(1597, f.getElementAtIndex(17));
  }
}