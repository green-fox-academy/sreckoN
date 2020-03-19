package sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SummationTest {

  private Summation adder;

  @BeforeEach
  void init() {
    adder = new Summation();
  }

  @Test
  void sumThrowsExceptionIfEmptyListIsGiven() {
    Exception thrown = assertThrows(Exception.class , () -> adder.sum(new ArrayList<>()));
  }

  @Test
  void sumThrowsExceptionIfNullGiven() {
    Exception thrown = assertThrows(Exception.class , () -> adder.sum(null));
  }

  @Test
  void sumSumsNumbersRight() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    try {
      assertEquals(15, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void sumSumsNumbersRight1() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(10);
    numbers.add(9);
    numbers.add(0);
    numbers.add(15);
    numbers.add(4);
    try {
      assertEquals(43, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void sumSumsNumbersRight2() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(50);
    numbers.add(-10);
    numbers.add(-9);
    numbers.add(0);
    numbers.add(-15);
    numbers.add(-4);
    try {
      assertEquals(12, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void sumSumsNumbersRight3() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    numbers.add(0);
    numbers.add(0);
    numbers.add(0);
    numbers.add(0);
    numbers.add(0);
    try {
      assertEquals(0, adder.sum(numbers));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}