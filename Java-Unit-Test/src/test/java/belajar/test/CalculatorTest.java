package belajar.test;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void testSumSuccess() {
    var result = calculator.sum(436, 10);
  }

}
