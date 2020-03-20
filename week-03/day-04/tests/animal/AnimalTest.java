package animal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

  private Animal animal;

  @BeforeEach
  void init() {
    this.animal = new Animal(30, 30);
  }

  @Test
  void constructorSetsTheRightValues() {
    assertEquals(30, animal.getHunger());
    assertEquals(30, animal.getThirst());
  }

  @Test
  void constructorSetsDefaultValuesIfNegativesGiven() {
    animal = new Animal(-5, -13);
    assertEquals(50, animal.getThirst());
    assertEquals(50, animal.getHunger());
  }

  @Test
  void emptyConstructorSetsDefaultValues() {
    animal = new Animal();
    assertEquals(50, animal.getThirst());
    assertEquals(50, animal.getHunger());
  }

  @Test
  void eatMethodDecrementsHungerVariable() {
    animal.eat();
    assertEquals(29, animal.getHunger());
  }

  @Test
  void eatMethodDoesNotDecrementIfHungerIsBelowOrZero() {
    animal = new Animal(0, 0);
    animal.eat();
    assertEquals(0, animal.getHunger());
  }

  @Test
  void drinkMethodDecrementsThirstVariable() {
    animal.drink();
    assertEquals(29, animal.getThirst());
  }

  @Test
  void drinkMethodDoesNotDecrementIfThirstIsBelowOrZero() {
    animal = new Animal(0, 0);
    animal.drink();
    assertEquals(0, animal.getThirst());
  }

  @Test
  void playMethodIncrementsHungerAndThirst() {
    animal.play();
    assertEquals(31, animal.getHunger());
    assertEquals(31, animal.getThirst());
  }

  @Test
  void setHungerSetsTheHungerToGivenValue() {
    animal.setHunger(100);
    assertEquals(100, animal.getHunger());
  }
}