package belajar.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void testSumSuccess() {
    var result = calculator.sum(436, 10);
    assertEquals(446, result);
  }

  @Test
  public void testDivideSuccess() {
    var result = calculator.divide(100, 10);
    assertEquals(10, result);
  }

  @Test
  public void testDivideFailed() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.divide(100, 0);
    });
  }
}
