package sharpie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharpieTest {

  private Sharpie sharpie;

  @BeforeEach
  void init() {
    sharpie = new Sharpie("red", 50);
  }

  @Test
  void constructorSetsColorAndWidthToGivenValues() {
    assertEquals("red", sharpie.getColor());
    assertEquals(50, sharpie.getWidth());
  }

  @Test
  void constructorSetsInkAmountToDefaultValue() {
    assertEquals(100, sharpie.getInkAmount());
  }

  @Test
  void constructorSetsColorToBlackIfNullGiven() {
    sharpie = new Sharpie(null, 30);
    assertEquals("Black", sharpie.getColor());
  }

  @Test
  void constructorSetsColorToBlackIfEmptyStringGiven() {
    sharpie = new Sharpie("", 30);
    assertEquals("Black", sharpie.getColor());
  }

  @Test
  void constructorSetsWidthToTenIfNegativeNumberGiven() {
    sharpie = new Sharpie("", -4);
    assertEquals(10, sharpie.getWidth());
  }

  @Test
  void useMethodDecrementsInkAmount() {
    sharpie.use();
    assertEquals(99, sharpie.getInkAmount());
  }

  @Test
  void useMethodDoesNotDecrementInkAmountIfItsZero() {
    sharpie.setInkAmount(0);
    sharpie.use();
    assertEquals(0, sharpie.getInkAmount());
  }

  @Test
  void setInkAmountSetsToGivenValue() {
    sharpie.setInkAmount(20);
    assertEquals(20, sharpie.getInkAmount());
  }

  @Test
  void setInkAmountDoesNotSetToGivenValueIfNegative() {
    sharpie.setInkAmount(-20);
    assertEquals(100, sharpie.getInkAmount());
  }
}