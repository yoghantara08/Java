package belajar.test;

import org.junit.jupiter.api.Test;

import belajar.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before All");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("After All");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Before each");
  }

  @AfterEach
  public void afterEach() {
    System.out.println("After each");
  }

  @Test
  @DisplayName("Test sum success")
  public void testSumSuccess() {
    var result = calculator.sum(436, 10);
    assertEquals(446, result);
  }

  @Test
  @DisplayName("Test divide success")
  public void testDivideSuccess() {
    var result = calculator.divide(100, 10);
    assertEquals(10, result);
  }

  @Test
  @DisplayName("Test failed to divided by zero")
  public void testDivideFailed() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.divide(100, 0);
    });
  }

  @Test
  @Disabled
  public void testDisabled() {
    System.out.println("Disabled");
  }

}
