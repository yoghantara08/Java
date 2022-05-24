package belajar.test;

public class Calculator {

  public Integer sum(Integer numb1, Integer numb2) {
    return numb1 + numb2;
  }

  public Integer divide(Integer numb1, Integer numb2) {
    if (numb2 == 0) {
      throw new IllegalArgumentException("Can't divide by zero");
    } else {
      return numb1 / numb2;
    }
  }

}
